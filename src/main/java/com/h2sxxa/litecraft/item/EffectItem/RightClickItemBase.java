package com.h2sxxa.litecraft.item.EffectItem;

import com.h2sxxa.litecraft.item.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class RightClickItemBase extends ItemBase{

    PotionEffect effect;
    public RightClickItemBase(String name, CreativeTabs tab,PotionEffect effect) {
        super(name, tab);
        this.effect=effect;
    }
    
    @SubscribeEvent
    public void onItemRightClick(World worldIn,EntityPlayer player){
        if (!worldIn.isRemote){
            player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
        }
    }
    
}
