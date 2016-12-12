package me.modmuss50.vrb;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(File configFile){
        //create the confutation file object from the given configuration file
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadconfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.getModID().equalsIgnoreCase("vtb")){
            // Re-sync Configs
            loadconfiguration();
        }
    }

    private static void loadconfiguration(){
        String[] def = {"EntityVillager_example1","EntityVillager_example2"};
        Settings.whitelistVillagers = configuration.getStringList("whitelistedVillagers","general",def,"Enter the Entity name such as EntityVillager");
        if(configuration.hasChanged()){
            configuration.save();
        }
    }

}
