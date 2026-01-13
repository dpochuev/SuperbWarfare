package com.superbwarfare.registry;

import com.superbwarfare.Tags;
import com.superbwarfare.item.ItemMonitor;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = Tags.MOD_ID)
public class ModItems {
    public static final Item MONITOR = new ItemMonitor().setRegistryName(Tags.MOD_ID, "monitor").setUnlocalizedName(Tags.MOD_ID + ".monitor");

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(MONITOR);
    }
}
