/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 21/08/2014 3:18:19 PM
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

public class ModelCrystalCharger extends ChromaModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape5;
	LODModelPart Shape5a;
	LODModelPart Shape6;
	LODModelPart Shape6a;

	public ModelCrystalCharger()
	{
		textureWidth = 64;
		textureHeight = 32;

		Shape1 = new LODModelPart(this, 11, 10);
		Shape1.addBox(6F, 0F, -2F, 1, 12, 4);
		Shape1.setRotationPoint(0F, 8F, 0F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0, 0F);
		Shape2b = new LODModelPart(this, 33, 12);
		Shape2b.addBox(-5F, -4.9F, -2F, 1, 6, 4);
		Shape2b.setRotationPoint(0F, 20F, 0F);
		Shape2b.setTextureSize(64, 32);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0, -0.7853982F);
		Shape2c = new LODModelPart(this, 44, 0);
		Shape2c.addBox(-7.8F, -4.9F, -2F, 1, 7, 4);
		Shape2c.setRotationPoint(0F, 12F, 0F);
		Shape2c.setTextureSize(64, 32);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0, 0.7853982F);
		Shape3 = new LODModelPart(this, 0, 0);
		Shape3.addBox(0F, 0F, 0F, 8, 1, 8);
		Shape3.setRotationPoint(-4F, 23F, -4F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 0, 27);
		Shape4.addBox(-2F, 0F, -2F, 4, 1, 4);
		Shape4.setRotationPoint(0F, 3F, 0F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 28, 27);
		Shape5.addBox(0F, 0F, 0F, 1, 1, 4);
		Shape5.setRotationPoint(-5F, 23F, -2F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5a = new LODModelPart(this, 17, 27);
		Shape5a.addBox(0F, 0F, 0F, 1, 1, 4);
		Shape5a.setRotationPoint(4F, 23F, -2F);
		Shape5a.setTextureSize(64, 32);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 44, 15);
		Shape6.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape6.setRotationPoint(-2F, 23F, 4F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new LODModelPart(this, 44, 12);
		Shape6a.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape6a.setRotationPoint(-2F, 23F, -5F);
		Shape6a.setTextureSize(64, 32);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li)
	{
		float angle = (Float)li.get(0);
		GL11.glPushMatrix();
		GL11.glRotatef(angle, 0, 1, 0);
		Shape1.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape4.render(te, f5);

		GL11.glRotated(180, 0, 1, 0);
		Shape1.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape4.render(te, f5);
		GL11.glPopMatrix();

		Shape3.render(te, f5);
		Shape5.render(te, f5);
		Shape5a.render(te, f5);
		Shape6.render(te, f5);
		Shape6a.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
