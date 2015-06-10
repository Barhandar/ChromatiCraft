/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 07/06/2015 5:23:48 PM
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

public class ModelTransportWindow extends ChromaModelBase
{
	//fields
	LODModelPart f1;
	LODModelPart f2;
	LODModelPart f3;
	LODModelPart c1;
	LODModelPart f4;
	LODModelPart c2;
	LODModelPart c3;
	LODModelPart r1;
	LODModelPart r2;
	LODModelPart c4;
	LODModelPart r3;
	LODModelPart r4;
	LODModelPart o1;
	LODModelPart c5;
	LODModelPart c6;
	LODModelPart c7;
	LODModelPart r5;
	LODModelPart r6;
	LODModelPart r7;
	LODModelPart r8;
	LODModelPart p1;
	LODModelPart o2;
	LODModelPart e1;
	LODModelPart o3;
	LODModelPart o4;
	LODModelPart o6;
	LODModelPart o5;
	LODModelPart o7;
	LODModelPart c8;
	LODModelPart p2;
	LODModelPart p3;
	LODModelPart p4;
	LODModelPart p5;
	LODModelPart p6;
	LODModelPart p7;
	LODModelPart p8;
	LODModelPart p9;
	LODModelPart p10;
	LODModelPart p11;
	LODModelPart p12;
	LODModelPart p13;
	LODModelPart p14;
	LODModelPart p15;
	LODModelPart p16;
	LODModelPart o8;
	LODModelPart e2;
	LODModelPart e3;
	LODModelPart e4;
	LODModelPart e5;
	LODModelPart e6;
	LODModelPart e7;
	LODModelPart e8;

	public ModelTransportWindow()
	{
		textureWidth = 64;
		textureHeight = 32;

		f1 = new LODModelPart(this, 57, 0);
		f1.addBox(7F, -7F, -1F, 1, 14, 2);
		f1.setRotationPoint(0F, 16F, 0F);
		f1.setTextureSize(64, 32);
		f1.mirror = true;
		this.setRotation(f1, 0F, 0F, 0F);
		f2 = new LODModelPart(this, 13, 4);
		f2.addBox(-8F, 7F, -1F, 16, 1, 2);
		f2.setRotationPoint(0F, 16F, 0F);
		f2.setTextureSize(64, 32);
		f2.mirror = true;
		this.setRotation(f2, 0F, 0F, 0F);
		f3 = new LODModelPart(this, 50, 0);
		f3.addBox(-8F, -7F, -1F, 1, 14, 2);
		f3.setRotationPoint(0F, 16F, 0F);
		f3.setTextureSize(64, 32);
		f3.mirror = true;
		this.setRotation(f3, 0F, 0F, 0F);
		c1 = new LODModelPart(this, 0, 5);
		c1.addBox(-1F, 1.5F, -0.5F, 2, 1, 1);
		c1.setRotationPoint(0F, 16F, 0F);
		c1.setTextureSize(64, 32);
		c1.mirror = true;
		this.setRotation(c1, 0F, 0F, 0.7853982F);
		f4 = new LODModelPart(this, 13, 0);
		f4.addBox(-8F, -8F, -1F, 16, 1, 2);
		f4.setRotationPoint(0F, 16F, 0F);
		f4.setTextureSize(64, 32);
		f4.mirror = true;
		this.setRotation(f4, 0F, 0F, 0F);
		c2 = new LODModelPart(this, 0, 5);
		c2.addBox(-1F, -2.5F, -0.5F, 2, 1, 1);
		c2.setRotationPoint(0F, 16F, 0F);
		c2.setTextureSize(64, 32);
		c2.mirror = true;
		this.setRotation(c2, 0F, 0F, 0.7853982F);
		c3 = new LODModelPart(this, 5, 0);
		c3.addBox(-2.5F, -1F, -0.5F, 1, 2, 1);
		c3.setRotationPoint(0F, 16F, 0F);
		c3.setTextureSize(64, 32);
		c3.mirror = true;
		this.setRotation(c3, 0F, 0F, 0.7853982F);
		r1 = new LODModelPart(this, 0, 8);
		r1.addBox(-2F, -5F, -0.5F, 4, 1, 1);
		r1.setRotationPoint(0F, 16F, 0F);
		r1.setTextureSize(64, 32);
		r1.mirror = true;
		this.setRotation(r1, 0F, 0F, -0.3926991F);
		r2 = new LODModelPart(this, 0, 11);
		r2.addBox(4F, -2F, -0.5F, 1, 4, 1);
		r2.setRotationPoint(0F, 16F, 0F);
		r2.setTextureSize(64, 32);
		r2.mirror = true;
		this.setRotation(r2, 0F, 0F, -0.3926991F);
		c4 = new LODModelPart(this, 5, 0);
		c4.addBox(1.5F, -1F, -0.5F, 1, 2, 1);
		c4.setRotationPoint(0F, 16F, 0F);
		c4.setTextureSize(64, 32);
		c4.mirror = true;
		this.setRotation(c4, 0F, 0F, 0.7853982F);
		r3 = new LODModelPart(this, 0, 8);
		r3.addBox(-2F, 4F, -0.5F, 4, 1, 1);
		r3.setRotationPoint(0F, 16F, 0F);
		r3.setTextureSize(64, 32);
		r3.mirror = true;
		this.setRotation(r3, 0F, 0F, -0.3926991F);
		r4 = new LODModelPart(this, 0, 11);
		r4.addBox(-5F, -2F, -0.5F, 1, 4, 1);
		r4.setRotationPoint(0F, 16F, 0F);
		r4.setTextureSize(64, 32);
		r4.mirror = true;
		this.setRotation(r4, 0F, 0F, -0.3926991F);
		o1 = new LODModelPart(this, 0, 20);
		o1.addBox(-0.5F, 4.5F, -0.5F, 1, 3, 1);
		o1.setRotationPoint(0F, 16F, 0F);
		o1.setTextureSize(64, 32);
		o1.mirror = true;
		this.setRotation(o1, 0F, 0F, 0F);
		c5 = new LODModelPart(this, 0, 5);
		c5.addBox(-1F, 1.5F, -0.5F, 2, 1, 1);
		c5.setRotationPoint(0F, 16F, 0F);
		c5.setTextureSize(64, 32);
		c5.mirror = true;
		this.setRotation(c5, 0F, 0F, 0F);
		c6 = new LODModelPart(this, 5, 0);
		c6.addBox(-2.5F, -1F, -0.5F, 1, 2, 1);
		c6.setRotationPoint(0F, 16F, 0F);
		c6.setTextureSize(64, 32);
		c6.mirror = true;
		this.setRotation(c6, 0F, 0F, 0F);
		c7 = new LODModelPart(this, 5, 0);
		c7.addBox(1.5F, -1F, -0.5F, 1, 2, 1);
		c7.setRotationPoint(0F, 16F, 0F);
		c7.setTextureSize(64, 32);
		c7.mirror = true;
		this.setRotation(c7, 0F, 0F, 0F);
		r5 = new LODModelPart(this, 0, 11);
		r5.addBox(-5F, -2F, -0.5F, 1, 4, 1);
		r5.setRotationPoint(0F, 16F, 0F);
		r5.setTextureSize(64, 32);
		r5.mirror = true;
		this.setRotation(r5, 0F, 0F, 0.3926991F);
		r6 = new LODModelPart(this, 0, 8);
		r6.addBox(-2F, -5F, -0.5F, 4, 1, 1);
		r6.setRotationPoint(0F, 16F, 0F);
		r6.setTextureSize(64, 32);
		r6.mirror = true;
		this.setRotation(r6, 0F, 0F, 0.3926991F);
		r7 = new LODModelPart(this, 0, 11);
		r7.addBox(4F, -2F, -0.5F, 1, 4, 1);
		r7.setRotationPoint(0F, 16F, 0F);
		r7.setTextureSize(64, 32);
		r7.mirror = true;
		this.setRotation(r7, 0F, 0F, 0.3926991F);
		r8 = new LODModelPart(this, 0, 8);
		r8.addBox(-2F, 4F, -0.5F, 4, 1, 1);
		r8.setRotationPoint(0F, 16F, 0F);
		r8.setTextureSize(64, 32);
		r8.mirror = true;
		this.setRotation(r8, 0F, 0F, 0.3926991F);
		p1 = new LODModelPart(this, 0, 0);
		p1.addBox(1F, 1.5F, -0.5F, 1, 3, 1);
		p1.setRotationPoint(0F, 16F, 0F);
		p1.setTextureSize(64, 32);
		p1.mirror = true;
		this.setRotation(p1, 0F, 0F, 1.867502F);
		o2 = new LODModelPart(this, 0, 25);
		o2.addBox(4.5F, -0.5F, -0.5F, 3, 1, 1);
		o2.setRotationPoint(0F, 16F, 0F);
		o2.setTextureSize(64, 32);
		o2.mirror = true;
		this.setRotation(o2, 0F, 0F, 0F);
		e1 = new LODModelPart(this, 12, 8);
		e1.addBox(-6.7F, -6.2F, -0.5F, 1, 3, 1);
		e1.setRotationPoint(0F, 16F, 0F);
		e1.setTextureSize(64, 32);
		e1.mirror = true;
		this.setRotation(e1, 0F, 0F, -2.879793F);
		o3 = new LODModelPart(this, 0, 17);
		o3.addBox(-7.5F, -0.5F, -0.5F, 3, 1, 1);
		o3.setRotationPoint(0F, 16F, 0F);
		o3.setTextureSize(64, 32);
		o3.mirror = true;
		this.setRotation(o3, 0F, 0F, -2.356194F);
		o4 = new LODModelPart(this, 0, 25);
		o4.addBox(-7.5F, -0.5F, -0.5F, 3, 1, 1);
		o4.setRotationPoint(0F, 16F, 0F);
		o4.setTextureSize(64, 32);
		o4.mirror = true;
		this.setRotation(o4, 0F, 0F, 0F);
		o6 = new LODModelPart(this, 0, 17);
		o6.addBox(-7.5F, -0.5F, -0.5F, 3, 1, 1);
		o6.setRotationPoint(0F, 16F, 0F);
		o6.setTextureSize(64, 32);
		o6.mirror = true;
		this.setRotation(o6, 0F, 0F, 0.7853982F);
		o5 = new LODModelPart(this, 0, 17);
		o5.addBox(-7.5F, -0.5F, -0.5F, 3, 1, 1);
		o5.setRotationPoint(0F, 16F, 0F);
		o5.setTextureSize(64, 32);
		o5.mirror = true;
		this.setRotation(o5, 0F, 0F, 2.356194F);
		o7 = new LODModelPart(this, 0, 17);
		o7.addBox(-7.5F, -0.5F, -0.5F, 3, 1, 1);
		o7.setRotationPoint(0F, 16F, 0F);
		o7.setTextureSize(64, 32);
		o7.mirror = true;
		this.setRotation(o7, 0F, 0F, -0.7853982F);
		c8 = new LODModelPart(this, 0, 5);
		c8.addBox(-1F, -2.5F, -0.5F, 2, 1, 1);
		c8.setRotationPoint(0F, 16F, 0F);
		c8.setTextureSize(64, 32);
		c8.mirror = true;
		this.setRotation(c8, 0F, 0F, 0F);
		p2 = new LODModelPart(this, 0, 0);
		p2.addBox(-2F, 1.5F, -0.5F, 1, 3, 1);
		p2.setRotationPoint(0F, 16F, 0F);
		p2.setTextureSize(64, 32);
		p2.mirror = true;
		this.setRotation(p2, 0F, 0F, -0.296706F);
		p3 = new LODModelPart(this, 0, 0);
		p3.addBox(-2F, -4.5F, -0.5F, 1, 3, 1);
		p3.setRotationPoint(0F, 16F, 0F);
		p3.setTextureSize(64, 32);
		p3.mirror = true;
		this.setRotation(p3, 0F, 0F, 0.296706F);
		p4 = new LODModelPart(this, 0, 0);
		p4.addBox(1F, 1.5F, -0.5F, 1, 3, 1);
		p4.setRotationPoint(0F, 16F, 0F);
		p4.setTextureSize(64, 32);
		p4.mirror = true;
		this.setRotation(p4, 0F, 0F, 0.296706F);
		p5 = new LODModelPart(this, 0, 0);
		p5.addBox(-2F, -4.5F, -0.5F, 1, 3, 1);
		p5.setRotationPoint(0F, 16F, 0F);
		p5.setTextureSize(64, 32);
		p5.mirror = true;
		this.setRotation(p5, 0F, 0F, 1.134464F);
		p6 = new LODModelPart(this, 0, 0);
		p6.addBox(-2F, -4.5F, -0.5F, 1, 3, 1);
		p6.setRotationPoint(0F, 16F, 0F);
		p6.setTextureSize(64, 32);
		p6.mirror = true;
		this.setRotation(p6, 0F, 0F, 1.867502F);
		p7 = new LODModelPart(this, 0, 0);
		p7.addBox(1F, -4.5F, -0.5F, 1, 3, 1);
		p7.setRotationPoint(0F, 16F, 0F);
		p7.setTextureSize(64, 32);
		p7.mirror = true;
		this.setRotation(p7, 0F, 0F, 1.27409F);
		p8 = new LODModelPart(this, 0, 0);
		p8.addBox(-2F, 1.5F, -0.5F, 1, 3, 1);
		p8.setRotationPoint(0F, 16F, 0F);
		p8.setTextureSize(64, 32);
		p8.mirror = true;
		this.setRotation(p8, 0F, 0F, 1.27409F);
		p9 = new LODModelPart(this, 0, 0);
		p9.addBox(1F, -4.5F, -0.5F, 1, 3, 1);
		p9.setRotationPoint(0F, 16F, 0F);
		p9.setTextureSize(64, 32);
		p9.mirror = true;
		this.setRotation(p9, 0F, 0F, -0.296706F);
		p10 = new LODModelPart(this, 0, 0);
		p10.addBox(1F, 1.5F, -0.5F, 1, 3, 1);
		p10.setRotationPoint(0F, 16F, 0F);
		p10.setTextureSize(64, 32);
		p10.mirror = true;
		this.setRotation(p10, 0F, 0F, -0.4363323F);
		p11 = new LODModelPart(this, 0, 0);
		p11.addBox(-2F, 1.5F, -0.5F, 1, 3, 1);
		p11.setRotationPoint(0F, 16F, 0F);
		p11.setTextureSize(64, 32);
		p11.mirror = true;
		this.setRotation(p11, 0F, 0F, -1.134464F);
		p12 = new LODModelPart(this, 0, 0);
		p12.addBox(1F, -4.5F, -0.5F, 1, 3, 1);
		p12.setRotationPoint(0F, 16F, 0F);
		p12.setTextureSize(64, 32);
		p12.mirror = true;
		this.setRotation(p12, 0F, 0F, -1.134464F);
		p13 = new LODModelPart(this, 0, 0);
		p13.addBox(-2F, -4.5F, -0.5F, 1, 3, 1);
		p13.setRotationPoint(0F, 16F, 0F);
		p13.setTextureSize(64, 32);
		p13.mirror = true;
		this.setRotation(p13, 0F, 0F, -0.4363323F);
		p14 = new LODModelPart(this, 0, 0);
		p14.addBox(1F, -4.5F, -0.5F, 1, 3, 1);
		p14.setRotationPoint(0F, 16F, 0F);
		p14.setTextureSize(64, 32);
		p14.mirror = true;
		this.setRotation(p14, 0F, 0F, 0.4363323F);
		p15 = new LODModelPart(this, 0, 0);
		p15.addBox(1F, 1.5F, -0.5F, 1, 3, 1);
		p15.setRotationPoint(0F, 16F, 0F);
		p15.setTextureSize(64, 32);
		p15.mirror = true;
		this.setRotation(p15, 0F, 0F, 1.134464F);
		p16 = new LODModelPart(this, 0, 0);
		p16.addBox(-2F, 1.5F, -0.5F, 1, 3, 1);
		p16.setRotationPoint(0F, 16F, 0F);
		p16.setTextureSize(64, 32);
		p16.mirror = true;
		this.setRotation(p16, 0F, 0F, 0.4363323F);
		o8 = new LODModelPart(this, 0, 20);
		o8.addBox(-0.5F, -7.5F, -0.5F, 1, 3, 1);
		o8.setRotationPoint(0F, 16F, 0F);
		o8.setTextureSize(64, 32);
		o8.mirror = true;
		this.setRotation(o8, 0F, 0F, 0F);
		e2 = new LODModelPart(this, 12, 8);
		e2.addBox(5.8F, -6.2F, -0.5F, 1, 3, 1);
		e2.setRotationPoint(0F, 16F, 0F);
		e2.setTextureSize(64, 32);
		e2.mirror = true;
		this.setRotation(e2, 0F, 0F, 2.879793F);
		e3 = new LODModelPart(this, 12, 8);
		e3.addBox(-6.7F, -6.2F, -0.5F, 1, 3, 1);
		e3.setRotationPoint(0F, 16F, 0F);
		e3.setTextureSize(64, 32);
		e3.mirror = true;
		this.setRotation(e3, 0F, 0F, 1.832596F);
		e4 = new LODModelPart(this, 12, 8);
		e4.addBox(-6.7F, -6.2F, -0.5F, 1, 3, 1);
		e4.setRotationPoint(0F, 16F, 0F);
		e4.setTextureSize(64, 32);
		e4.mirror = true;
		this.setRotation(e4, 0F, 0F, -1.308997F);
		e5 = new LODModelPart(this, 12, 8);
		e5.addBox(-6.7F, -6.2F, -0.5F, 1, 3, 1);
		e5.setRotationPoint(0F, 16F, 0F);
		e5.setTextureSize(64, 32);
		e5.mirror = true;
		this.setRotation(e5, 0F, 0F, 0.2617994F);
		e6 = new LODModelPart(this, 12, 8);
		e6.addBox(5.8F, -6.2F, -0.5F, 1, 3, 1);
		e6.setRotationPoint(0F, 16F, 0F);
		e6.setTextureSize(64, 32);
		e6.mirror = true;
		this.setRotation(e6, 0F, 0F, -0.2617994F);
		e7 = new LODModelPart(this, 12, 8);
		e7.addBox(5.8F, -6.2F, -0.5F, 1, 3, 1);
		e7.setRotationPoint(0F, 16F, 0F);
		e7.setTextureSize(64, 32);
		e7.mirror = true;
		this.setRotation(e7, 0F, 0F, -1.832596F);
		e8 = new LODModelPart(this, 12, 8);
		e8.addBox(5.8F, -6.2F, -0.5F, 1, 3, 1);
		e8.setRotationPoint(0F, 16F, 0F);
		e8.setTextureSize(64, 32);
		e8.mirror = true;
		this.setRotation(e8, 0F, 0F, 1.308997F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li) {
		f1.render(te, f5);
		f2.render(te, f5);
		f3.render(te, f5);
		f4.render(te, f5);

		GL11.glPushMatrix();
		GL11.glScaled(1, 1, 1);

		e1.render(te, f5);
		e2.render(te, f5);
		e3.render(te, f5);
		e4.render(te, f5);
		e5.render(te, f5);
		e6.render(te, f5);
		e7.render(te, f5);
		e8.render(te, f5);

		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glScaled(1, 1, 0.99);

		o1.render(te, f5);
		o2.render(te, f5);
		o3.render(te, f5);
		o4.render(te, f5);
		o6.render(te, f5);
		o5.render(te, f5);
		o7.render(te, f5);
		o8.render(te, f5);

		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glScaled(1, 1, 1);

		r1.render(te, f5);
		r2.render(te, f5);
		r3.render(te, f5);
		r4.render(te, f5);
		r5.render(te, f5);
		r6.render(te, f5);
		r7.render(te, f5);
		r8.render(te, f5);

		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glScaled(1, 1, 0.99);

		p1.render(te, f5);
		p2.render(te, f5);
		p3.render(te, f5);
		p4.render(te, f5);
		p5.render(te, f5);
		p6.render(te, f5);
		p7.render(te, f5);
		p8.render(te, f5);
		p9.render(te, f5);
		p10.render(te, f5);
		p11.render(te, f5);
		p12.render(te, f5);
		p13.render(te, f5);
		p14.render(te, f5);
		p15.render(te, f5);
		p16.render(te, f5);

		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glScaled(1, 1, 1);

		c1.render(te, f5);
		c2.render(te, f5);
		c3.render(te, f5);
		c4.render(te, f5);
		c5.render(te, f5);
		c6.render(te, f5);
		c7.render(te, f5);
		c8.render(te, f5);

		GL11.glPopMatrix();
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
