package dev.mangojellypudding.randommango;

import com.mojang.logging.LogUtils;
import dev.mangojellypudding.randommango.config.*;
import dev.mangojellypudding.randommango.registries.RMBlocks;
import dev.mangojellypudding.randommango.registries.RMCreativeModeTabs;
import dev.mangojellypudding.randommango.registries.RMItems;
import dev.mangojellypudding.randommango.registries.conditions.RMConditions;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(RandomMango.MODID)
public class RandomMango {
    public static final String MODID = "randommango";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RandomMango(IEventBus modEventBus, ModContainer modContainer) {
        // Registries
        RMBlocks.BLOCKS.register(modEventBus);
        RMItems.ITEMS.register(modEventBus);
        RMCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);
        RMConditions.CONDITION_CODECS.register(modEventBus);

        // Config
        modContainer.registerConfig(ModConfig.Type.CLIENT, ClientConfig.SPEC);
        modContainer.registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);
        modContainer.registerConfig(ModConfig.Type.SERVER, ServerConfig.SPEC);
        modContainer.registerConfig(ModConfig.Type.STARTUP, StartupConfig.SPEC);
    }}
