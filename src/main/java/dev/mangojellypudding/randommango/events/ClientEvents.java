package dev.mangojellypudding.randommango.events;

import dev.mangojellypudding.randommango.RandomMango;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = RandomMango.MODID, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        RandomMango.LOGGER.info("HELLO FROM CLIENT SETUP");
        RandomMango.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
}
