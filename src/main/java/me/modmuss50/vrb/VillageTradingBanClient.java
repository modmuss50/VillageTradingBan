package me.modmuss50.vrb;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.gui.GuiMerchant;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;

public class VillageTradingBanClient {
    public void load() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void rightclick(GuiOpenEvent event) {
        if (event.gui != null && event.gui.getClass().getCanonicalName().equals(GuiMerchant.class.getCanonicalName())) {
            event.setCanceled(true);
        }
    }
}
