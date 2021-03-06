// Date: 7/26/2014 1:23:45 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package assets.letsmodreboot.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLocomotivePushRod extends ModelBase
{
  //fields
    ModelRenderer RightDriveRod;
  
  public ModelLocomotivePushRod()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      RightDriveRod = new ModelRenderer(this, 0, 98);
      RightDriveRod.addBox(-1F, -0.5F, -14.5F, 1, 1, 15);
      RightDriveRod.setRotationPoint(0F, 0F, 0F);
      RightDriveRod.setTextureSize(64, 32);
      RightDriveRod.mirror = true;
      setRotation(RightDriveRod, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    RightDriveRod.render(f5);
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
