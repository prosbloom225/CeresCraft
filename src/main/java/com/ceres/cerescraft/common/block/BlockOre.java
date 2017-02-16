package com.ceres.cerescraft.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by prosbloom on 8/8/16.
 */
public class BlockOre extends BlockBase {
    public BlockOre(String unlocalizedName) {
        super(unlocalizedName, Material.ROCK, false, false);
    }

    @Override
    public boolean canWrench(EntityPlayer player, World world, BlockPos pos) {
        return false;
    }
}
