package com.h2sxxa.litecraft.item;

import com.h2sxxa.litecraft.Main;
import com.h2sxxa.litecraft.init.ModItem;
import com.h2sxxa.litecraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{
    public FoodBase(String name, int amount, float saturation, boolean iswolfFood,CreativeTabs tab){
        super(amount,saturation,iswolfFood);
        setCreativeTab(tab);
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItem.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerModelsrender(this, 0, "inventory");
        
    }

    
}
