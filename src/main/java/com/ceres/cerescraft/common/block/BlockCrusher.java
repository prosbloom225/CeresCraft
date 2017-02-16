package com.ceres.cerescraft.common.block;

import com.ceres.cerescraft.common.lib.LibBlockNames;
import com.ceres.cerescraft.common.tileentity.TileCrusher;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by prosbloom on 8/3/16.
 */
public class BlockCrusher extends BlockBaseMachine {
    public BlockCrusher() {
        super(LibBlockNames.BLOCK_CRUSHER, Material.ROCK, false, true);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileCrusher();
    }

}
