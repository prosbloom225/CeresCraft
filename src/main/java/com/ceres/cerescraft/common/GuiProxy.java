package com.ceres.cerescraft.common;

import com.ceres.cerescraft.client.gui.GuiCrusher;
import com.ceres.cerescraft.common.container.ContainerCrusher;
import com.ceres.cerescraft.common.tileentity.TileBase;
import com.ceres.cerescraft.common.tileentity.TileCrusher;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by prosbloom on 8/10/16.
 */
public class GuiProxy implements IGuiHandler{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        System.out.println("getServerGuiElement called");
        TileEntity entity = world.getTileEntity(new BlockPos(x, y, z));
        if (entity != null) {
            System.out.println("Getting gui for id: " + ID);
            if (entity instanceof TileCrusher) {
                return new ContainerCrusher(player.inventory, (TileBase) entity);
            }
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        System.out.println("getClientGuiElement called");
        TileEntity entity = world.getTileEntity(new BlockPos(x, y, z));
        if (entity != null) {
            System.out.println("Getting gui for id: " + ID);
            if (entity instanceof TileCrusher) {
                TileBase containerTileEntity = (TileBase) entity;
                return new GuiCrusher(containerTileEntity, new ContainerCrusher(player.inventory, containerTileEntity));
            }
        }
        return null;
    }

}
