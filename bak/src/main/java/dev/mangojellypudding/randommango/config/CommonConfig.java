package dev.mangojellypudding.randommango.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CommonConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue RICK_ROLL_WHEN_JOIN = BUILDER
            .translation("randommango.configuration.server.rick_roll_when_join")
            .comment("Whether to play a Rick Roll song when a player joins the server")
            .define("rickRollWhenJoin", true);

    public static final ModConfigSpec SPEC = BUILDER.build();
}
