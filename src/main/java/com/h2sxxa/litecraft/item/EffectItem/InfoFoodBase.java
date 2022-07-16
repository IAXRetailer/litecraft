package com.h2sxxa.litecraft.item.EffectItem;

import java.util.List;

import org.lwjgl.input.Keyboard;
import com.h2sxxa.litecraft.item.FoodBase;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InfoFoodBase extends FoodBase{
    String key;
    public InfoFoodBase(String name, int amount, float saturation, boolean iswolfFood,CreativeTabs tab){
        super(name, amount,saturation,iswolfFood, tab);
        this.key=name.concat(".information.litecraft");
    }
    
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) && I18n.hasKey(key.concat(".desc")))
        {
            for (String strline:I18n.format(key.concat(".desc")).split("\n"))
            {
                tooltip.add(strline);
            }
        }
        else if (I18n.hasKey(key))
        {
            for (String strline:I18n.format(key).split("\n"))
            {
                tooltip.add(strline);
            }
        }
    }
}
