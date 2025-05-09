package com.aetherteam.overworldores.mixin;

import com.aetherteam.overworldores.conditions.CommonConditionConversion;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.serialization.Codec;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Function;

@Mixin(ResourceCondition.class)
public interface ResourceConditionMixin {
    @WrapOperation(method = "<clinit>", at = @At(value = "INVOKE", target = "Lcom/mojang/serialization/Codec;withAlternative(Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/Codec;Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;"))
    private static <T, U> Codec<T> wrapWithPossibleNeoConditions(Codec<T> primary, Codec<U> alternative, Function<U, T> converter, Operation<Codec<T>> original) {
        return (Codec<T>) CommonConditionConversion.wrapCodec((Codec<ResourceCondition>) original.call(primary, alternative, converter));
    }
}
