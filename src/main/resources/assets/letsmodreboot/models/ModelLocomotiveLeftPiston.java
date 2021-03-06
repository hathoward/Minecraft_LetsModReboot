// Date: 7/25/2014 11:36:52 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package assets.letsmodreboot.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLocomotiveLeftPiston extends ModelBase
{
	  //fields
    ModelRenderer LeftRodSleeve;
    ModelRenderer LeftPistonRod;
  
  public ModelLocomotiveLeftPiston()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      LeftRodSleeve = new ModelRenderer(this, 28, 58);
      LeftRodSleeve.addBox(-1F, -2F, -1F, 2, 3, 2);
      LeftRodSleeve.setRotationPoint(8F, -5F, -9F);
      LeftRodSleeve.setTextureSize(64, 32);
      LeftRodSleeve.mirror = true;
      setRotation(LeftRodSleeve, 0F, 0F, 0F);
      LeftPistonRod = new ModelRenderer(this, 36, 58);
      LeftPistonRod.addBox(-1F, 0F, -5F, 1, 1, 5);
      LeftPistonRod.setRotationPoint(8F, -6F, -10F);
      LeftPistonRod.setTextureSize(64, 32);
      LeftPistonRod.mirror = true;
      setRotation(LeftPistonRod, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    LeftRodSleeve.render(f5);
    LeftPistonRod.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
