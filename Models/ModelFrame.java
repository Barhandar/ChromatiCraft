/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 11/05/2015 3:04:26 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ChromatiCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import Reika.ChromatiCraft.Base.ChromaModelBase;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;

public class ModelFrame extends ChromaModelBase
{
	public final double scale;

	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;

	public ModelFrame(double scale)
	{
		this.scale = scale;
		textureWidth = 128;
		textureHeight = 64;

		Shape1 = new LODModelPart(this, 76, 0);
		Shape1.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape1.setRotationPoint(7F, 8F, 7F);
		Shape1.setTextureSize(128, 64);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 71, 0);
		Shape1a.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape1a.setRotationPoint(-8F, 8F, 7F);
		Shape1a.setTextureSize(128, 64);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape1b = new LODModelPart(this, 81, 0);
		Shape1b.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape1b.setRotationPoint(7F, 8F, -8F);
		Shape1b.setTextureSize(128, 64);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0F);
		Shape1c = new LODModelPart(this, 66, 0);
		Shape1c.addBox(0F, 0F, 0F, 1, 16, 1);
		Shape1c.setRotationPoint(-8F, 8F, -8F);
		Shape1c.setTextureSize(128, 64);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 38);
		Shape2.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2.setRotationPoint(-7F, 8F, 7F);
		Shape2.setTextureSize(128, 64);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 0, 32);
		Shape2a.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2a.setRotationPoint(-7F, 8F, -8F);
		Shape2a.setTextureSize(128, 64);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 0, 41);
		Shape2b.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2b.setRotationPoint(-7F, 23F, 7F);
		Shape2b.setTextureSize(128, 64);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 0, 35);
		Shape2c.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2c.setRotationPoint(-7F, 23F, -8F);
		Shape2c.setTextureSize(128, 64);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape3.setRotationPoint(7F, 8F, -7F);
		Shape3.setTextureSize(128, 64);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 0, 16);
		Shape3a.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape3a.setRotationPoint(-8F, 8F, -7F);
		Shape3a.setTextureSize(128, 64);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new LODModelPart(this, 31, 16);
		Shape3b.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape3b.setRotationPoint(-8F, 23F, -7F);
		Shape3b.setTextureSize(128, 64);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape3c = new LODModelPart(this, 31, 0);
		Shape3c.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape3c.setRotationPoint(7F, 23F, -7F);
		Shape3c.setTextureSize(128, 64);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li)
	{
		GL11.glPushMatrix();
		GL11.glScaled(scale, scale, scale);
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
		Shape3c.render(te, f5);
		GL11.glPopMatrix();
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
