package net.rubukaree.echoes.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rubukaree.echoes.CreateEchoes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateEchoes.MOD_ID);

    public static final RegistryObject<Item> MALFORMED_CRYSTAL = ITEMS.register(
            "malformed_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COAL_FRAGMENTS = ITEMS.register(
            "coal_fragments",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
