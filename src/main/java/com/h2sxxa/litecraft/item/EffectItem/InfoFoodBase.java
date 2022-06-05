package com.h2sxxa.litecraft.item.EffectItem;

import java.util.List;

import com.h2sxxa.litecraft.Main;
import com.h2sxxa.litecraft.init.ModItem;
import com.h2sxxa.litecraft.util.IHasModel;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InfoFoodBase extends ItemFood implements IHasModel{
    String key;

    public InfoFoodBase(String name, int amount, float saturation, boolean iswolfFood,CreativeTabs tab){
        super(amount,saturation,iswolfFood);
        setCreativeTab(tab);
        setUnlocalizedName(name);
        setRegistryName(name);
        this.key=name.concat(".information.litecraft");
        ModItem.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
        
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        for (String i:I18n.format(key).split("/n")){
            tooltip.add(i);
        }
    }
}
