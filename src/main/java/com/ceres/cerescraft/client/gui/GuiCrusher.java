package com.ceres.cerescraft.client.gui;


import com.ceres.cerescraft.common.container.ContainerCrusher;
import com.ceres.cerescraft.common.lib.LibBlockNames;
import com.ceres.cerescraft.common.lib.LibMisc;
import com.ceres.cerescraft.common.tileentity.TileBase;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

public class GuiCrusher extends GuiContainer {
    public static final int WIDTH = 180;
    public static final int HEIGHT = 152;

    private static final ResourceLocation background = new ResourceLocation(LibMisc.MODID, "textures/gui/" + LibBlockNames.BLOCK_CRUSHER + ".png");

    public GuiCrusher (TileBase tileEntity, ContainerCrusher container) {
        super(container);

        xSize = WIDTH;
        ySize = HEIGHT;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(background);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
