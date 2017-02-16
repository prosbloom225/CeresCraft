package com.ceres.cerescraft.client;

import com.ceres.cerescraft.common.CommonProxy;
import com.ceres.cerescraft.common.ModBlocks;
import com.ceres.cerescraft.common.ModItems;
import com.ceres.cerescraft.common.lib.LibMisc;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by prosbloom on 8/3/16.
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        // Typically initialization of models and such goes here:
        ModBlocks.initRenders();
        ModItems.initRenders();
        OBJLoader.INSTANCE.addDomain(LibMisc.MODID);
    }
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

}
