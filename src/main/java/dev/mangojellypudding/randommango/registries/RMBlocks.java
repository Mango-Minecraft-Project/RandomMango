package dev.mangojellypudding.randommango.registries;

import dev.mangojellypudding.randommango.RandomMango;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface RMBlocks {
    DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RandomMango.MODID);

    DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
}
