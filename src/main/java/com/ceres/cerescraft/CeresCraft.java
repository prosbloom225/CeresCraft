package com.ceres.cerescraft;


import com.ceres.cerescraft.common.CeresCraftCreativeTab;
import com.ceres.cerescraft.common.CommonProxy;
import com.ceres.cerescraft.common.lib.LibMisc;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LibMisc.MODID, name = LibMisc.MODNAME, version = LibMisc.MODVERSION)
public class CeresCraft {

    @SidedProxy(clientSide = "com.ceres.cerescraft.client.ClientProxy", serverSide = "com.ceres.cerescraft.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static CeresCraft instance;

    public static CeresCraftCreativeTab creativeTab = new CeresCraftCreativeTab();


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
