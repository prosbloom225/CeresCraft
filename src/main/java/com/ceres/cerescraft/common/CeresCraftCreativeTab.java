package com.ceres.cerescraft.common;

import com.ceres.cerescraft.common.lib.LibMisc;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBook;

/**
 * Created by prosbloom on 8/3/16.
 */
public class CeresCraftCreativeTab extends CreativeTabs {
    public CeresCraftCreativeTab() {
        super(LibMisc.MODID);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.dustChromite;
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}
