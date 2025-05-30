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

                        output.accept(ModBlocks.COMPACTED_COAL_BLOCK.get());
                        output.accept(ModBlocks.CRYSTALLIZED_COAL_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
