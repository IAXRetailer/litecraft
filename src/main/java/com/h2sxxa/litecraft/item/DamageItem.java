package com.h2sxxa.litecraft.item;

import java.util.List;

import com.h2sxxa.litecraft.item.EffectItem.InfoItemBase;

import net.minecraft.creativetab.CreativeTabs;

public class DamageItem extends InfoItemBase{

    public DamageItem(String name, CreativeTabs tab,List<String> Information,int maxDamageIn) {
        super(name, tab,Information);
        setMaxDamage(maxDamageIn);
    }
}
