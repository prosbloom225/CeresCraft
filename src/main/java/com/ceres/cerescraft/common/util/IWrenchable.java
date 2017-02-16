package com.ceres.cerescraft.common.util;

import net.minecraft.block.BlockPortal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;

/**
 * Created by prosbloom on 8/3/16.
 */
public interface IWrenchable {
    public ArrayList<ItemStack> wrenchBlock(EntityPlayer player, World world, BlockPos pos, boolean returnDrops);
    public boolean canWrench(EntityPlayer player, World world, BlockPos pos);
}
