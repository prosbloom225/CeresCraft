package com.ceres.cerescraft.common;

import com.ceres.cerescraft.common.item.ItemBase;
import com.ceres.cerescraft.common.lib.LibItemNames;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by prosbloom on 8/5/16.
 */
public class ModItems {

    public static List<ItemBase> items = new ArrayList<ItemBase>();

    // Dust
    public static ItemBase dustChromite;
    public static ItemBase dustMolybdenite;
    public static ItemBase dustNickel;
    public static ItemBase dustSulfur;

    // Ingots
    public static ItemBase ingotGraphite;
    public static ItemBase ingotHastelloy;
    public static ItemBase ingotNickel;



    public static void init() {
        // Dust
        items.add(dustChromite = new ItemBase(LibItemNames.ITEM_DUST_CHROMITE));
        items.add(dustMolybdenite= new ItemBase(LibItemNames.ITEM_DUST_MOLYBDENITE));
        items.add(dustNickel = new ItemBase(LibItemNames.ITEM_DUST_NICKEL));
        items.add(dustSulfur = new ItemBase(LibItemNames.ITEM_DUST_SULFUR));

        // Ingots
        items.add(ingotGraphite = new ItemBase(LibItemNames.ITEM_INGOT_GRAPHITE));
        items.add(ingotHastelloy= new ItemBase(LibItemNames.ITEM_INGOT_HASTELLOY));
        items.add(ingotNickel = new ItemBase(LibItemNames.ITEM_INGOT_NICKEL));



        for (ItemBase item : items) {
            System.out.println("item: " + item.getUnlocalizedName().substring(5));
            GameRegistry.register(item);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void initRenders() {
        for (ItemBase item : ModItems.items) {
            System.out.println("initRenders called for item: " + item.getUnlocalizedName());
            item.initModel();
        }
    }

}
