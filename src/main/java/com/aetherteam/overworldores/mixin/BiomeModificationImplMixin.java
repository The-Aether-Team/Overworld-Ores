package com.aetherteam.overworldores.mixin;

import com.aetherteam.overworldores.world.BiomeModificationData;
import com.aetherteam.overworldores.world.BiomeModificationDataRegistries;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationImpl;
import net.minecraft.core.RegistryAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BiomeModificationImpl.class)
public abstract class BiomeModificationImplMixin {
    @Inject(method = "finalizeWorldGen", at = @At(value = "INVOKE", target = "Lnet/fabricmc/fabric/impl/biome/modification/BiomeModificationMarker;fabric_markModified()V", shift = At.Shift.AFTER))
    private void loadDataDrivenBiomeModifications(RegistryAccess impl, CallbackInfo ci) {
        impl.registryOrThrow(BiomeModificationDataRegistries.BIOME_MODIFIERS_KEY).holders().forEach(ref -> {
            var modificationData = ref.value();

            BiomeModifications.create(ref.aetherFabric$getKey().location())
                    .add(modificationData.phase(), modificationData.selector(), modificationData::modify);
        });
    }
}
