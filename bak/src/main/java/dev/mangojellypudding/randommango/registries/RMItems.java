package dev.mangojellypudding.randommango.registries;

import dev.mangojellypudding.randommango.RandomMango;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface RMItems {
    DeferredRegister.Items ITEMS = DeferredRegister.createItems(RandomMango.MODID);

    DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("example_block", RMBlocks.EXAMPLE_BLOCK);
    DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));
}
