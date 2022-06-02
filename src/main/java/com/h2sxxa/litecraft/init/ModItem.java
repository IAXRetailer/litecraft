package com.h2sxxa.litecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;
import com.h2sxxa.litecraft.cretivetab.MainTab;
import com.h2sxxa.litecraft.item.ItemBase;
import com.h2sxxa.litecraft.item.EffectItem.Feature;
import com.h2sxxa.litecraft.item.EffectItem.Heart;
import com.h2sxxa.litecraft.item.EffectItem.InfoItemBase;
import com.h2sxxa.litecraft.item.EffectItem.RightClickItemBase;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class ModItem {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    
    public static final Item CARD = new ItemBase("card", MainTab.MainTab);
    public static final Item BLUE_JADE = new RightClickItemBase("blue_jade", MainTab.MainTab,Lists.newArrayList("test1","test2"), new PotionEffect(MobEffects.WATER_BREATHING,1200,2,true,true),2400);
    public static final Item HEART = new Heart("heart",MainTab.MainTab,Lists.newArrayList("test1","test2"),null,20,1,2);
    public static final Item HEART_BROKEN = new InfoItemBase("heart_broken",MainTab.MainTab,Lists.newArrayList("test1","test2"));
    public static final Feature PHOENIX_DOWN = new Feature("phoenix_down", MainTab.MainTab,3,Lists.newArrayList("test1","test2"));

}
