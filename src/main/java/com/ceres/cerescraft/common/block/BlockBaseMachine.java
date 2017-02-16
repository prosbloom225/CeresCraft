package com.ceres.cerescraft.common.block;

import com.ceres.cerescraft.CeresCraft;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by prosbloom on 8/3/16.
 */
public abstract class BlockBaseMachine extends BlockBase implements ITileEntityProvider {

    protected BlockBaseMachine(String unlocalizedName, Material material, boolean orientation, boolean wrenchable) {
        super(unlocalizedName, material, orientation, wrenchable);
    }
    public abstract TileEntity createNewTileEntity (World world, int i);



    @Override
    public boolean canWrench(EntityPlayer player, World world, BlockPos pos) {
        return true;
    }

}
