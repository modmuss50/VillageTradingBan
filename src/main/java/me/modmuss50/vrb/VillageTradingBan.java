package me.modmuss50.vrb;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityInteractEvent;

@Mod(modid = "vtb", name = "VillageTradingBan", version = "1.0.0")
public class VillageTradingBan {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void interact(EntityInteractEvent entityInteractEvent){
        if(entityInteractEvent.target instanceof EntityVillager){
            entityInteractEvent.setCanceled(true);
        }
    }

}
