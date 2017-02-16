package com.ceres.cerescraft.common.block;

import com.ceres.cerescraft.CeresCraft;
import com.ceres.cerescraft.common.lib.LibMisc;
import com.ceres.cerescraft.common.util.IWrenchable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.ArrayList;

/**
 * Created by prosbloom on 8/3/16.
 */
public abstract class BlockBase extends Block implements IWrenchable{

    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    public boolean orientation = true, wrenchable = true;

    public BlockBase(String unlocalizedName, Material material, boolean orientation, boolean wrenchable) {
        super(material);
        this.orientation = orientation;
        this.wrenchable = wrenchable;
        if (orientation) {
            this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        }
        setRegistryName(unlocalizedName);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(CeresCraft.creativeTab);
    }
    @Override
    public final boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        System.out.println("Block activated: ");
        if (!world.isRemote) {
            player.openGui(CeresCraft.instance, 0, world, pos.getX(), pos.getY(), pos.getZ());
        }
        return true;
    }

        @Override
    public ArrayList<ItemStack> wrenchBlock(EntityPlayer player, World world, BlockPos pos, boolean returnDrops) {
        return null;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        System.out.println("initModel called");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(
                LibMisc.MODID + ":" + this.getUnlocalizedName().substring(5), "inventory"));
    }

}
