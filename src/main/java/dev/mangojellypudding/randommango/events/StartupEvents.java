package dev.mangojellypudding.randommango.events;

import dev.mangojellypudding.randommango.RandomMango;
import dev.mangojellypudding.randommango.registries.RMItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@EventBusSubscriber
public class StartupEvents {
    @SubscribeEvent
    static void commonSetup(FMLCommonSetupEvent event) {
        RandomMango.LOGGER.info("HELLO FROM COMMON SETUP");
//        if (Config.LOG_DIRT_BLOCK.getAsBoolean()) {
//            RandomMango.LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
//        }
//        RandomMango.LOGGER.info("{}{}", Config.MAGIC_NUMBER_INTRODUCTION.get(), Config.MAGIC_NUMBER.getAsInt());
//        Config.ITEM_STRINGS.get().forEach((item) -> RandomMango.LOGGER.info("ITEM >> {}", item));
    }
    @SubscribeEvent
    static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(RMItems.EXAMPLE_BLOCK_ITEM);
        }
    }

}
