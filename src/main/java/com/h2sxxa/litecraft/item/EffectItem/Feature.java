package com.h2sxxa.litecraft.item.EffectItem;

import com.h2sxxa.litecraft.item.DamageItem;

import net.minecraft.creativetab.CreativeTabs;

public class Feature extends DamageItem{
    public Feature(String name, CreativeTabs tab, int maxDamageIn) {
        super(name, tab,maxDamageIn);
        setMaxStackSize(1);
    }
}
