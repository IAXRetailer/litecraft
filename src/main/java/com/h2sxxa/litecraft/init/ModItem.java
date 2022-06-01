package com.h2sxxa.litecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.h2sxxa.litecraft.cretivetab.MainTab;
import com.h2sxxa.litecraft.item.ItemBase;

import net.minecraft.item.Item;

public class ModItem {
    public static final List<Item> ITEMS= new ArrayList<Item>();

    
    //public static final Item
    public static final Item  Card = new ItemBase("card", MainTab.MainTab);
}
