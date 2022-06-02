package com.h2sxxa.litecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.h2sxxa.litecraft.cretivetab.MainTab;
import com.h2sxxa.litecraft.item.ItemBase;
import com.h2sxxa.litecraft.item.EffectItem.RightClickItemBase;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class ModItem {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    
    //public static final Item
    public static final Item CARD = new ItemBase("card", MainTab.MainTab);
    public static final Item BLUE_JADE = new RightClickItemBase("blue_jade", MainTab.MainTab, new PotionEffect(MobEffects.WATER_BREATHING,1000,2,true,true));
}
