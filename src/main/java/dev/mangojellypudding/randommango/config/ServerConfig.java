package dev.mangojellypudding.randommango.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import static net.neoforged.neoforge.common.ModConfigSpec.BooleanValue;


import java.lang.reflect.Field;

public interface ServerConfig {
    ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    ModConfigSpec.Builder RECIPES = BUILDER
            .comment("Recipe Configuration")
            .translation("randommango.configuration.server.recipes")
            .push("recipes");

    ModConfigSpec.Builder XEKR_CRAFTING = RECIPES
            .comment("XeKr's Crafting")
            .translation("randommango.configuration.server.recipes.xekr_crafting")
            .push("xekr_crafting");

    ModConfigSpec.Builder XEKR_CRAFTING_LAZY = XEKR_CRAFTING
            .comment("If true, XeKr's Crafting will be lazy loaded. This is useful for servers that don't use XeKr's Crafting.")
            .translation("randommango.configuration.server.recipes.xekr_crafting.lazy")
            .push("lazy");

    ModConfigSpec.BooleanValue XEKR_CRAFTING_LAZY_ENABLED = XEKR_CRAFTING_LAZY
            .comment("If true, XeKr's Lazy Crafting Recipes will be enabled. This is useful for servers that don't use XeKr's Crafting.")
            .translation("randommango.configuration.server.recipes.xekr_crafting.lazy.enabled")
            .define("enabled", true);

    ModConfigSpec.BooleanValue XEKR_CRAFTING_LAZY_CHEST = XEKR_CRAFTING_LAZY
            .comment("Enables XeKr's Lazy Crafting Chest Recipes.")
            .translation("randommango.configuration.server.recipes.xekr_crafting.lazy.chest")
            .define("chest", true);

    interface Route {
        interface Recipes {
            interface XekrCrafting {
                interface Lazy {
                    BooleanValue ENABLED = XEKR_CRAFTING_LAZY_ENABLED;
                    BooleanValue CHEST = XEKR_CRAFTING_LAZY_CHEST;
                }
            }
        }
    }

    static ModConfigSpec.ConfigValue<?> get(String path) {
        return get(path.split("\\."));
    }

    // Generate by AI
    static ModConfigSpec.ConfigValue<?> get(String[] path) {
        try {
            Class<?> currentClass = ServerConfig.Route.class;
            Object currentObject = null;

            for (int i = 0; i < path.length; i++) {
                Field field = currentClass.getDeclaredField(path[i]);
                field.setAccessible(true);

                if (i == path.length - 1) {
                    Object value = field.get(null);
                    if (value instanceof ModConfigSpec.ConfigValue<?> configValue) {
                        return configValue;
                    } else {
                        throw new IllegalArgumentException("Field is not a ConfigValue: " + path[i]);
                    }
                } else {
                    currentClass = field.getType();
                }
            }

            throw new IllegalArgumentException("Invalid path");
        } catch (Exception e) {
            throw new RuntimeException("Failed to get path path: " + String.join(".", path), e);
        }
    }

    // Final step
    ModConfigSpec SPEC = BUILDER.build();
}
