package com.h2sxxa.litecraft.item.EffectItem;

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
public class Heart extends OneUseItemBase{
    int healamo;
    public Heart(String name, CreativeTabs tab, PotionEffect effect, int cooldowntick,int Usetime,int healamo) {
        super(name, tab, effect, cooldowntick, Usetime);
        this.healamo=healamo;
    }
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!player.world.isRemote&&player.getHealth()!=player.getMaxHealth())
        {
            player.heal(healamo);
            player.getHeldItem(hand).shrink(Usetime);
            player.getCooldownTracker().setCooldown(player.getHeldItem(hand).getItem(), cooldowntick);
        }
        return EnumActionResult.SUCCESS;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
    {

        if (!player.world.isRemote&&player.getHealth()!=player.getMaxHealth())
        {
            player.heal(healamo);
            player.getHeldItem(handIn).shrink(Usetime);
            player.getCooldownTracker().setCooldown(player.getHeldItem(handIn).getItem(), cooldowntick);
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));

    }
    
}
