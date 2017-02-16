package com.ceres.cerescraft.common.item;

import com.ceres.cerescraft.CeresCraft;
import com.ceres.cerescraft.common.lib.LibMisc;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by prosbloom on 8/5/16.
 */
public class ItemBase extends Item {
    public ItemBase(String unlocalizedName) {
        setCreativeTab(CeresCraft.creativeTab);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(unlocalizedName);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        System.out.println("initModel called for item: " + this.getUnlocalizedName());
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(
                LibMisc.MODID + ":" + this.getUnlocalizedName().substring(5), "inventory"));
    }
}
