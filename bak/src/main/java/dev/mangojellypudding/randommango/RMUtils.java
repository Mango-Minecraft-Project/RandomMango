package dev.mangojellypudding.randommango;

import net.neoforged.neoforge.common.ModConfigSpec;

public interface RMUtils {
    interface Config {
        static boolean toBoolean(ModConfigSpec.ConfigValue<?> value) {
            return value instanceof ModConfigSpec.BooleanValue booleanValue ? booleanValue.get() : false;
        }
    }
}
