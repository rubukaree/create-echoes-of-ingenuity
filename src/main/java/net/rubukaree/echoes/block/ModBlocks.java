package net.rubukaree.echoes.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rubukaree.echoes.CreateEchoes;
import net.rubukaree.echoes.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateEchoes.MOD_ID);

    public static final RegistryObject<Block> COMPACTED_COAL_BLOCK = registerBlock(
            "compacted_coal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).explosionResistance(750.0f).strength(4.5f)));
    public static final RegistryObject<Block> CRYSTALLIZED_COAL_BLOCK = registerBlock(
            "crystallized_coal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).explosionResistance(300.0f).strength(2.5f)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
