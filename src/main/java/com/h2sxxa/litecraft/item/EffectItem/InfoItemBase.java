package com.h2sxxa.litecraft.item.EffectItem;

import java.util.List;

import com.h2sxxa.litecraft.item.ItemBase;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InfoItemBase extends ItemBase{
    String key;
    //List<String> vaules;
    public InfoItemBase(String name,CreativeTabs tab){
        super(name, tab);
        this.key=name.concat(".information.litecraft");
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        for (String i:I18n.format(key).split("/n")){
            tooltip.add(i);
        }
    }
}
