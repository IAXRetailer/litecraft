package com.h2sxxa.litecraft.item.EffectItem;

import java.util.List;

import com.h2sxxa.litecraft.item.DamageItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;



public class Feature extends DamageItem{
    public Feature(String name, CreativeTabs tab, int maxDamageIn,List<String> Information) {
        super(name, tab, Information,maxDamageIn);
        setMaxStackSize(1);
    }


    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!player.world.isRemote)
        {
            player.getHeldItem(hand).damageItem(1, player);
        }
        return EnumActionResult.SUCCESS;
    }
}
