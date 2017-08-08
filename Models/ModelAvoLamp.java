/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 12/09/2016 9:11:06 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ChromatiCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.ChromatiCraft.Base.ChromaModelBase;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;

public class ModelAvoLamp extends ChromaModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape3a;

	public ModelAvoLamp() {
		textureWidth = 32;
		textureHeight = 32;

		Shape1 = new LODModelPart(this, 7, 9);
		Shape1.addBox(-1F, -8F, -0.5F, 2, 7, 1);
		Shape1.setRotationPoint(0F, 24F, 0F);
		Shape1.setTextureSize(32, 32);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0.6108652F, 1.570796F, 0F);
		Shape1a = new LODModelPart(this, 0, 18);
		Shape1a.addBox(-1F, -8F, -0.5F, 2, 7, 1);
		Shape1a.setRotationPoint(0F, 24F, 0F);
		Shape1a.setTextureSize(32, 32);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0.6108652F, -1.570796F, 0F);
		Shape1b = new LODModelPart(this, 0, 0);
		Shape1b.addBox(-1F, -8F, -0.5F, 2, 7, 1);
		Shape1b.setRotationPoint(0F, 24F, 0F);
		Shape1b.setTextureSize(32, 32);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0.6108652F, 3.141593F, 0F);
		Shape1c = new LODModelPart(this, 0, 9);
		Shape1c.addBox(-1F, -8F, -0.5F, 2, 7, 1);
		Shape1c.setRotationPoint(0F, 24F, 0F);
		Shape1c.setTextureSize(32, 32);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0.6108652F, 0F, 0F);
		Shape2 = new LODModelPart(this, 7, 0);
		Shape2.addBox(0F, 0F, 0F, 2, 1, 4);
		Shape2.setRotationPoint(-1F, 23F, -2F);
		Shape2.setTextureSize(32, 32);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 20, 4);
		Shape3.addBox(0F, 0F, 0F, 1, 1, 2);
		Shape3.setRotationPoint(1F, 23F, -1F);
		Shape3.setTextureSize(32, 32);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 20, 0);
		Shape3a.addBox(0F, 0F, 0F, 1, 1, 2);
		Shape3a.setRotationPoint(-2F, 23F, -1F);
		Shape3a.setTextureSize(32, 32);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li) {
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);
		Shape2.render(te, f5);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
	}

}
