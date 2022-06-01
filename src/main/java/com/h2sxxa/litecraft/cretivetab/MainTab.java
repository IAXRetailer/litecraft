package com.h2sxxa.litecraft.cretivetab;

import com.h2sxxa.litecraft.init.ModItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MainTab{
	public static final CreativeTabs MainTab = new CreativeTabs(CreativeTabs.getNextID(), "CardTab")
	{
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItem.CARD);
        }
    };
}
    
