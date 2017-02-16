package com.ceres.cerescraft.common;

import com.ceres.cerescraft.CeresCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

/**
 * Created by prosbloom on 8/3/16.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        // Initialization of blocks and items typically goes here:
        ModBlocks.init();
        ModItems.init();
        //ModCrafting.init();
    }

    public void init(FMLInitializationEvent e) {
        NetworkRegistry.INSTANCE.registerGuiHandler(CeresCraft.instance, new GuiProxy());
        System.out.println("GuiProxy initialized");
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

}
