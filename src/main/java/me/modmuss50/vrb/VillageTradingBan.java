package me.modmuss50.vrb;


import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = "vtb", name = "VillageTradingBan", version = "2.0.0")
public class VillageTradingBan {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void interact(PlayerInteractEvent.EntityInteract entityInteractEvent){
        if(entityInteractEvent.getTarget() instanceof EntityVillager){
            entityInteractEvent.setCanceled(true);
        }
    }

}
