package com.ceres.cerescraft.common;

import com.ceres.cerescraft.common.block.BlockBase;
import com.ceres.cerescraft.common.block.BlockCrusher;
import com.ceres.cerescraft.common.block.BlockOre;
import com.ceres.cerescraft.common.lib.LibBlockNames;
import com.ceres.cerescraft.common.tileentity.TileBase;
import com.ceres.cerescraft.common.tileentity.TileCrusher;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prosbloom on 8/3/16.
 */
public class ModBlocks {
    public static List<BlockBase> blocks = new ArrayList<BlockBase>();
    public static List<TileBase> tiles = new ArrayList<TileBase>();
    // Ores
    public static BlockOre oreNickel;
    public static BlockOre oreChromite;
    public static BlockOre oreMolybdenite;

    // Blocks
    public static BlockBase blockHastelloy;
    public static BlockBase blockNickel;

    // Machines
    public static BlockCrusher blockCrusher;
    public static TileCrusher tileCrusher;

    public static void init() {
        // Ores
        blocks.add(oreNickel = new BlockOre(LibBlockNames.ORE_NICKEL));
        blocks.add(oreChromite = new BlockOre(LibBlockNames.ORE_CHROMITE));
        blocks.add(oreMolybdenite = new BlockOre(LibBlockNames.ORE_MOLYBDENITE));

        // Blocks

        // Machines
        blocks.add(blockCrusher = new BlockCrusher());
        tiles.add(tileCrusher = new TileCrusher());

        // Blocks
        for (BlockBase block : blocks) {
            System.out.println("Block: " + block.getUnlocalizedName().substring(5));
            GameRegistry.register(block);
            GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        }
        // Tiles
        for (TileBase tile : tiles) {
            System.out.println("Tile: " +tile.getDisplayName());
            GameRegistry.registerTileEntity(tile.getClass(), tile.getClass().toString());
        }

    }

    @SideOnly(Side.CLIENT)
    public static void initRenders() {
        for (BlockBase block : blocks) {
            System.out.println("initRenders called for block: " + block.getUnlocalizedName());
            block.initModel();
        }
    }
}
