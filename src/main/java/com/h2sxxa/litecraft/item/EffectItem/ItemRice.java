package com.h2sxxa.litecraft.item.EffectItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemRice extends InfoFoodBase{
    PotionEffect effect;
    public ItemRice(String name, int amount, float saturation, boolean iswolfFood, CreativeTabs tab,PotionEffect effect,int cooldowntick) {
        super(name, amount, saturation, iswolfFood, tab);
        this.effect=effect;
    }
    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 10;
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!player.world.isRemote){
            if (!player.isPotionActive(MobEffects.STRENGTH)){
                player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
            }
            else{
                int amplifier=player.getActivePotionEffect(MobEffects.STRENGTH).getAmplifier();
                int potiontick=player.getActivePotionEffect(MobEffects.STRENGTH).getDuration();
                if (amplifier == 4){
                    player.removeActivePotionEffect(MobEffects.STRENGTH);
                    player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, potiontick+120, amplifier, effect.getIsAmbient(), effect.doesShowParticles()));
                }
                else{
                    player.removeActivePotionEffect(MobEffects.STRENGTH);
                    player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, potiontick+60, amplifier+1, effect.getIsAmbient(), effect.doesShowParticles()));
                }
            }
        }
    }
    
}
