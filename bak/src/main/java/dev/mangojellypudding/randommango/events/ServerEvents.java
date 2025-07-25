package dev.mangojellypudding.randommango.events;

import dev.mangojellypudding.randommango.RandomMango;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@EventBusSubscriber
public class ServerEvents {
    @SubscribeEvent
    static void onServerStarting(ServerStartingEvent event) {
        RandomMango.LOGGER.info("HELLO from server starting");
    }
}
