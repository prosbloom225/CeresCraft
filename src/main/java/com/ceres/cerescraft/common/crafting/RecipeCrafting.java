package com.ceres.cerescraft.common.crafting;

import com.ceres.cerescraft.common.ModBlocks;
import com.ceres.cerescraft.common.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by prosbloom on 4/21/16.
 */
public class RecipeCrafting {
    public static void initCraftingRecipes() {
        // Ingot <-> Block
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockHastelloy),
                new Object [] {
                        "###",
                        "###",
                        "###",
                        '#', ModItems.ingotHastelloy
                });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotHastelloy, 9),
                new Object[] {
                        ModBlocks.blockHastelloy
                });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockNickel),
                new Object [] {
                        "###",
                        "###",
                        "###",
                        '#', ModItems.ingotNickel
                });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotNickel, 9),
                new Object[] {
                        ModBlocks.blockNickel
                });
    }
}

