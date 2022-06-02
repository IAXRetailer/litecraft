package com.h2sxxa.litecraft.item.EffectItem;

import java.util.List;

import com.h2sxxa.litecraft.item.ItemBase;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InfoItemBase extends ItemBase{
    List<String> Information;
    public InfoItemBase(String name,CreativeTabs tab,List<String> Information){
        super(name, tab);
        this.Information=Information;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        for(String i : Information){
            tooltip.add(i);
        }
    }
    
}
