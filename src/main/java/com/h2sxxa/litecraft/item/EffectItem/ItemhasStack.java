package com.h2sxxa.litecraft.item.EffectItem;

import net.minecraft.creativetab.CreativeTabs;

public class ItemhasStack extends InfoItemBase{

    public ItemhasStack(String name, CreativeTabs tab,int maxStackSize) {
        super(name, tab);
        setMaxStackSize(maxStackSize);
    }
}
