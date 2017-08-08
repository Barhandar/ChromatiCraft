/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 08/11/2014 8:00:07 PM
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

public class ModelInfuser2 extends ChromaModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2a;
	LODModelPart Shape3a;

	public ModelInfuser2()
	{
		textureWidth = 64;
		textureHeight = 32;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 10, 1, 10);
		Shape1.setRotationPoint(-5F, 23F, -5F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 0, 12);
		Shape2a.addBox(3F, -7.3F, -1F, 1, 5, 2);
		Shape2a.setRotationPoint(0F, 23F, 0F);
		Shape2a.setTextureSize(64, 32);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0.7853982F);
		Shape3a = new LODModelPart(this, 7, 12);
		Shape3a.addBox(-8F, 0F, -1F, 1, 4, 2);
		Shape3a.setRotationPoint(0F, 16.7F, 0F);
		Shape3a.setTextureSize(64, 32);
		Shape3a.mirror = true;
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li)
	{
		Shape1.render(te, f5);

		GL11.glPushMatrix();
		for (int i = 0; i < 8; i++) {
			GL11.glRotated(45, 0, 1, 0);
			Shape2a.render(te, f5);
			Shape3a.render(te, f5);
		}
		GL11.glPopMatrix();
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
