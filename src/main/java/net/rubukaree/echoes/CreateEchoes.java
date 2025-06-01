package net.rubukaree.echoes;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.rubukaree.echoes.block.ModBlocks;
import net.rubukaree.echoes.item.ModCreativeModTabs;
import net.rubukaree.echoes.item.ModItems;
import org.slf4j.Logger;

@Mod(CreateEchoes.MOD_ID)
public class CreateEchoes {
    public static final String MOD_ID = "create-eoi";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CreateEchoes(FMLJavaModLoadingContext context) {
        LOGGER.info("Loading CEOI context");
        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("C:EOI is loaded on your server");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("YEAH!");
            LOGGER.info("Hello {}", Minecraft.getInstance().getUser().getName());
            LOGGER.info("thx for installing the mod");
            LOGGER.info("- rubukaree");
        }
    }
}
