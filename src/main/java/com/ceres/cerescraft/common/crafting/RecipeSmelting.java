package com.ceres.cerescraft.common.crafting;

import com.ceres.cerescraft.common.ModBlocks;
import com.ceres.cerescraft.common.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by prosbloom on 4/24/16.
 */
public class RecipeSmelting {
    public static void initSmeltingRecipes () {
        // Metals
        GameRegistry.addSmelting(ModBlocks.oreNickel, new ItemStack(ModItems.ingotNickel), 1.0f);
        GameRegistry.addSmelting(ModItems.dustNickel, new ItemStack(ModItems.ingotNickel), 0);

        GameRegistry.addSmelting(ModBlocks.oreChromite, new ItemStack(Items.IRON_INGOT), 0);
        GameRegistry.addSmelting(ModItems.dustChromite, new ItemStack(Items.IRON_INGOT), 0);

        GameRegistry.addSmelting(ModBlocks.oreMolybdenite, new ItemStack(ModItems.dustSulfur), 0);
        GameRegistry.addSmelting(ModItems.dustMolybdenite, new ItemStack(ModItems.dustSulfur), 0);


        // Materials
        GameRegistry.addSmelting(Items.COAL, new ItemStack(ModItems.ingotGraphite), 0);



    }
}

