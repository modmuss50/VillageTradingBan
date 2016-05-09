package me.modmuss50.vrb;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "vtb", name = "VillageTradingBan", version = "1.0.0")
public class VillageTradingBan {

    @SideOnly(Side.CLIENT)
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        new VillageTradingBanClient().load();
    }

}
