package com.h2sxxa.litecraft.item.EffectItem;

import com.h2sxxa.litecraft.item.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class RightClickItemBase extends ItemBase{
    PotionEffect effect;
    int cooldowntick;
    public RightClickItemBase(String name, CreativeTabs tab,PotionEffect effect,int cooldowntick) {
        super(name, tab);
        this.effect=effect;
    }
    //ck block
    public EnumActionResult onItemUse(EntityLivingBase entityLiving,EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!worldIn.isRemote)
        {
            player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
            if (entityLiving instanceof EntityPlayer)
            {
                ((EntityPlayer)entityLiving).getCooldownTracker().setCooldown(this, cooldowntick);
            }
        }

        return EnumActionResult.SUCCESS;
    }
    //Ck in air
    public ActionResult<ItemStack> onItemRightClick(EntityLivingBase entityLiving,World worldIn, EntityPlayer player, EnumHand handIn)
    {

        if (!worldIn.isRemote){
            player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
            if (entityLiving instanceof EntityPlayer)
            {
                ((EntityPlayer)entityLiving).getCooldownTracker().setCooldown(this, cooldowntick);
            }
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));

    }
}
