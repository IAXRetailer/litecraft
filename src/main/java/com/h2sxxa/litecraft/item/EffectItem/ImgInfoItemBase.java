package com.h2sxxa.litecraft.item.EffectItem;

import java.util.List;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ImgInfoItemBase extends InfoDescBase{

    public ImgInfoItemBase(String name, CreativeTabs tab) {
        super(name, tab);
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add("");
    }
}
