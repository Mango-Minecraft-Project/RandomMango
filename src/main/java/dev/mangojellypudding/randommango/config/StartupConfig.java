package dev.mangojellypudding.randommango.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class StartupConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue REGISTRY_TEST = BUILDER
            .translation("randommango.configuration.startup.registry_test")
            .comment("Whether to run the registry test on startup")
            .define("registryTest", true);

    public static final ModConfigSpec SPEC = BUILDER.build();
}
