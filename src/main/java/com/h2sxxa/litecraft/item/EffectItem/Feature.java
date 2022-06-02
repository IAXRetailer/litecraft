package com.h2sxxa.litecraft.item.EffectItem;

import java.util.List;

import com.h2sxxa.litecraft.item.DamageItem;

import net.minecraft.creativetab.CreativeTabs;



public class Feature extends DamageItem{
    public Feature(String name, CreativeTabs tab, int maxDamageIn,List<String> Information) {
        super(name, tab, Information,maxDamageIn);
    }


}
