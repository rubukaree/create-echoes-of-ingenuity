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
    public static final RegistryObject<Item> CRYSTAL_FRAGMENTS = ITEMS.register(
            "crystal_fragments",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_MOLD = ITEMS.register(
            "diamond_mold",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FILLED_DIAMOND_MOLD = ITEMS.register(
            "filled_diamond_mold",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SANDY_FRAGMENTS = ITEMS.register(
            "sandy_fragments",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_POWDER = ITEMS.register(
            "quartz_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MARINE_CRYSTALS = ITEMS.register(
            "marine_crystals",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MARINE_FRAGMENTS = ITEMS.register(
            "marine_fragments",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_FRAGMENT = ITEMS.register(
            "soul_fragments",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURE_CRYSTAL = ITEMS.register(
            "pure_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_POWDER = ITEMS.register(
            "nether_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_POWDER = ITEMS.register(
            "soul_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STABLE_INGOT = ITEMS.register(
            "stable_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNSTABLE_INGOT = ITEMS.register(
            "unstable_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
