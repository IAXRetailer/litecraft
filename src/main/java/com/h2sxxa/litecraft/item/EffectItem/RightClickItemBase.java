package com.h2sxxa.litecraft.item.EffectItem;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class RightClickItemBase extends InfoItemBase{
    PotionEffect effect;
    int cooldowntick;
    //EntityLivingBase entityLiving;
    //ItemChorusFruit
    public RightClickItemBase(String name, CreativeTabs tab,List<String> Information,PotionEffect effect,int cooldowntick) {
        super(name, tab,Information);
        this.effect=effect;
        this.cooldowntick=cooldowntick;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!player.world.isRemote)
        {
            player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
            player.getCooldownTracker().setCooldown(player.getHeldItem(hand).getItem(), cooldowntick);
            //player.getHeldItem(hand).shrink(1);
        }
        return EnumActionResult.SUCCESS;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
    {

        if (!player.world.isRemote){
            player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
            player.getCooldownTracker().setCooldown(player.getHeldItem(handIn).getItem(), cooldowntick);
            //player.getHeldItem(hand).shrink(1);
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));

    }
}
