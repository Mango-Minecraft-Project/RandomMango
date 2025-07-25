package dev.mangojellypudding.randommango.registries.conditions;

import com.mojang.serialization.MapCodec;
import dev.mangojellypudding.randommango.RandomMango;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public interface RMConditions {
    DeferredRegister<MapCodec<? extends ICondition>> CONDITION_CODECS = DeferredRegister.create(NeoForgeRegistries.Keys.CONDITION_CODECS, RandomMango.MODID);

    Supplier<MapCodec<ConfigEnabled.Server>> SERVER_CONFIG = CONDITION_CODECS.register("server_config", () -> ConfigEnabled.Server.CODEC);
}
