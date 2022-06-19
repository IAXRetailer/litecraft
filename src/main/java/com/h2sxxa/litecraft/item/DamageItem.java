package com.h2sxxa.litecraft.item;


import com.h2sxxa.litecraft.item.EffectItem.InfoDescBase;

import net.minecraft.creativetab.CreativeTabs;

public class DamageItem extends InfoDescBase{

    public DamageItem(String name, CreativeTabs tab,int maxDamageIn) {
        super(name, tab);
        setMaxDamage(maxDamageIn);
    }

    @Override
    public boolean isDamageable() {
        return true;
    }
}
