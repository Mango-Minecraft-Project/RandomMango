package dev.mangojellypudding.randommango.registries.conditions;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import dev.mangojellypudding.randommango.RMUtils;
import dev.mangojellypudding.randommango.config.ServerConfig;
import net.neoforged.neoforge.common.conditions.ICondition;
import org.jetbrains.annotations.NotNull;

public interface ConfigEnabled {
    record Server(String path) implements ICondition {
        public static final MapCodec<Server> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
                Codec.STRING.fieldOf("path").forGetter(Server::path)
        ).apply(instance, Server::new));

        @Override
        public boolean test(@NotNull IContext iContext) {
            return RMUtils.Config.toBoolean(ServerConfig.get("Recipes." + path));
        }

        @Override
        public @NotNull MapCodec<? extends ICondition> codec() {
            return CODEC;
        }
    }
}
