package net.rubukaree.echoes.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rubukaree.echoes.CreateEchoes;
import net.rubukaree.echoes.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateEchoes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ECHOES_TAB = CREATIVE_MODE_TAB.register(
            "echoes_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MALFORMED_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.create-eoi_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MALFORMED_CRYSTAL.get());
                        output.accept(ModItems.COAL_FRAGMENTS.get());
                        output.accept(ModItems.CRYSTAL_FRAGMENTS.get());
                        output.accept(ModItems.DIAMOND_MOLD.get());
                        output.accept(ModItems.FILLED_DIAMOND_MOLD.get());
                        output.accept(ModItems.SANDY_FRAGMENTS.get());
                        output.accept(ModItems.QUARTZ_POWDER.get());
                        output.accept(ModItems.MARINE_CRYSTALS.get());
                        output.accept(ModItems.MARINE_FRAGMENTS.get());
                        output.accept(ModItems.SOUL_FRAGMENT.get());
                        output.accept(ModItems.PURE_CRYSTAL.get());
                        output.accept(ModItems.NETHER_POWDER.get());
                        output.accept(ModItems.SOUL_POWDER.get());
                        output.accept(ModItems.STABLE_INGOT.get());
                        output.accept(ModItems.UNSTABLE_INGOT.get());

                        output.accept(ModBlocks.COMPACTED_COAL_BLOCK.get());
                        output.accept(ModBlocks.CRYSTALLIZED_COAL_BLOCK.get());
                        output.accept(ModBlocks.REFINED_SAND.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

// if you are seeing this, wth are you doing here?, you should be playing the game!
// -------------------------------------------------------------------------------------------
// if you want to learn how to make mods, check this out!
// https://www.youtube.com/watch?v=55qUIf3GMss&list=PLKGarocXCE1H9Y21-pxjt5Pt8bW14twa-&index=1