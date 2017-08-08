/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 13/09/2016 7:49:14 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package Reika.ChromatiCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.ChromatiCraft.Base.ChromaModelBase;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;

public class ModelAvoLaser extends ChromaModelBase
{
	//fields
	LODModelPart Shape3;
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape1d;
	LODModelPart Shape1e;
	LODModelPart Shape1f;
	LODModelPart Shape1g;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape2d;
	LODModelPart Shape2e;
	LODModelPart Shape2f;
	LODModelPart Shape2g;
	LODModelPart Shape3a;
	LODModelPart Shape3b;

	public ModelAvoLaser()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape3 = new LODModelPart(this, 97, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 14, 9);
		Shape3.setRotationPoint(7F, 9F, -1F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape1 = new LODModelPart(this, 0, 25);
		Shape1.addBox(-3F, -8F, 0F, 6, 1, 2);
		Shape1.setRotationPoint(0F, 16F, -3F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, -2.356194F);
		Shape1a = new LODModelPart(this, 0, 0);
		Shape1a.addBox(-3F, -8F, 0F, 6, 1, 2);
		Shape1a.setRotationPoint(0F, 16F, -3F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape1b = new LODModelPart(this, 0, 5);
		Shape1b.addBox(-3F, -8F, 0F, 6, 1, 2);
		Shape1b.setRotationPoint(0F, 16F, -3F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0.7853982F);
		Shape1c = new LODModelPart(this, 0, 10);
		Shape1c.addBox(-3F, -8F, 0F, 6, 1, 2);
		Shape1c.setRotationPoint(0F, 16F, -3F);
		Shape1c.setTextureSize(128, 128);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0F, 1.570796F);
		Shape1d = new LODModelPart(this, 0, 15);
		Shape1d.addBox(-3F, -8F, 0F, 6, 1, 2);
		Shape1d.setRotationPoint(0F, 16F, -3F);
		Shape1d.setTextureSize(128, 128);
		Shape1d.mirror = true;
		this.setRotation(Shape1d, 0F, 0F, 2.356194F);
		Shape1e = new LODModelPart(this, 0, 20);
		Shape1e.addBox(-3F, -8F, 0F, 6, 1, 2);
		Shape1e.setRotationPoint(0F, 16F, -3F);
		Shape1e.setTextureSize(128, 128);
		Shape1e.mirror = true;
		this.setRotation(Shape1e, 0F, 0F, 3.141593F);
		Shape1f = new LODModelPart(this, 0, 35);
		Shape1f.addBox(-3F, -8F, 0F, 6, 1, 2);
		Shape1f.setRotationPoint(0F, 16F, -3F);
		Shape1f.setTextureSize(128, 128);
		Shape1f.mirror = true;
		this.setRotation(Shape1f, 0F, 0F, -0.7853982F);
		Shape1g = new LODModelPart(this, 0, 30);
		Shape1g.addBox(-3F, -8F, 0F, 6, 1, 2);
		Shape1g.setRotationPoint(0F, 16F, -3F);
		Shape1g.setTextureSize(128, 128);
		Shape1g.mirror = true;
		this.setRotation(Shape1g, 0F, 0F, -1.570796F);
		Shape2 = new LODModelPart(this, 18, 0);
		Shape2.addBox(-0.5F, -8.5F, 0F, 1, 1, 3);
		Shape2.setRotationPoint(0F, 16F, -4F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, -0.3926991F);
		Shape2a = new LODModelPart(this, 18, 5);
		Shape2a.addBox(-0.5F, -8.5F, 0F, 1, 1, 3);
		Shape2a.setRotationPoint(0F, 16F, -4F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0.3926991F);
		Shape2b = new LODModelPart(this, 18, 10);
		Shape2b.addBox(-0.5F, -8.5F, 0F, 1, 1, 3);
		Shape2b.setRotationPoint(0F, 16F, -4F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 1.178097F);
		Shape2c = new LODModelPart(this, 18, 15);
		Shape2c.addBox(-0.5F, -8.5F, 0F, 1, 1, 3);
		Shape2c.setRotationPoint(0F, 16F, -4F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 1.963495F);
		Shape2d = new LODModelPart(this, 18, 20);
		Shape2d.addBox(-0.5F, -8.5F, 0F, 1, 1, 3);
		Shape2d.setRotationPoint(0F, 16F, -4F);
		Shape2d.setTextureSize(128, 128);
		Shape2d.mirror = true;
		this.setRotation(Shape2d, 0F, 0F, 2.748893F);
		Shape2e = new LODModelPart(this, 18, 25);
		Shape2e.addBox(-0.5F, -8.5F, 0F, 1, 1, 3);
		Shape2e.setRotationPoint(0F, 16F, -4F);
		Shape2e.setTextureSize(128, 128);
		Shape2e.mirror = true;
		this.setRotation(Shape2e, 0F, 0F, -2.748893F);
		Shape2f = new LODModelPart(this, 18, 30);
		Shape2f.addBox(-0.5F, -8.5F, 0F, 1, 1, 3);
		Shape2f.setRotationPoint(0F, 16F, -4F);
		Shape2f.setTextureSize(128, 128);
		Shape2f.mirror = true;
		this.setRotation(Shape2f, 0F, 0F, -1.963495F);
		Shape2g = new LODModelPart(this, 18, 35);
		Shape2g.addBox(-0.5F, -8.5F, 0F, 1, 1, 3);
		Shape2g.setRotationPoint(0F, 16F, -4F);
		Shape2g.setTextureSize(128, 128);
		Shape2g.mirror = true;
		this.setRotation(Shape2g, 0F, 0F, -1.178097F);
		Shape3a = new LODModelPart(this, 28, 0);
		Shape3a.addBox(0F, 0F, 0F, 14, 16, 9);
		Shape3a.setRotationPoint(-7F, 8F, -1F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new LODModelPart(this, 75, 0);
		Shape3b.addBox(0F, 0F, 0F, 1, 14, 9);
		Shape3b.setRotationPoint(-8F, 9F, -1F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li)
	{
		Shape3.render(te, f5);
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);
		Shape1d.render(te, f5);
		Shape1e.render(te, f5);
		Shape1f.render(te, f5);
		Shape1g.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape2d.render(te, f5);
		Shape2e.render(te, f5);
		Shape2f.render(te, f5);
		Shape2g.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
	}

}
