package com.h2sxxa.litecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;
import com.h2sxxa.litecraft.cretivetab.MainTab;
import com.h2sxxa.litecraft.item.*;
import com.h2sxxa.litecraft.item.EffectItem.*;

import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;



public class ModItem {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    
    public static final Item CARD = new ItemBase("card", MainTab.MainTab);
    public static final Item BLUE_JADE = new RightClickItemBase("blue_jade", MainTab.MainTab, new PotionEffect(MobEffects.WATER_BREATHING,1200,2,false,true),2400);
    public static final Item HEART = new Heart("heart",MainTab.MainTab,null,10,1,2);
    public static final Item HEART_BROKEN = new InfoItemBase("heart_broken",MainTab.MainTab);
    public static final Item PHOENIX_DOWN = new Feature("phoenix_down", MainTab.MainTab,3);
    public static final Item ATREASURE = new ItemTreature("atreasure", MainTab.MainTab, null, 10, 1, Lists.newArrayList(ModItem.CARD,Items.APPLE));
    public static final Item RICE = new ItemRice("rice", 1, 1, true, MainTab.MainTab, new PotionEffect(MobEffects.STRENGTH,1200,0,false,true), 10);
    public static final Item BODY = new RightClickItemBase("body", MainTab.MainTab, new PotionEffect(MobEffects.ABSORPTION,1200,4,false,true), 3600);
    public static final Item GHOST = new ItemhasStack("ghost", MainTab.MainTab,1);
}
