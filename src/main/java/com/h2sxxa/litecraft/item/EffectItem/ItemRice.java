package com.h2sxxa.litecraft.item.EffectItem;

import java.util.List;

import org.lwjgl.input.Keyboard;

import com.h2sxxa.litecraft.item.FoodBase;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemRice extends FoodBase{
    PotionEffect effect;
    String Ampfiler;
    String Durtime;
    String key;
    public ItemRice(String name, int amount, float saturation, boolean iswolfFood, CreativeTabs tab,PotionEffect effect,int cooldowntick) {
        super(name, amount, saturation, iswolfFood, tab);
        this.effect=effect;
        this.key=name.concat(".information.litecraft");
        setAlwaysEdible();
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 10;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        EntityPlayer player=Minecraft.getMinecraft().player;
        if(player!=null){
            if (!player.isPotionActive(MobEffects.STRENGTH)){
                this.Ampfiler="1";
                this.Durtime="1200";
            }else{
                this.Ampfiler=String.valueOf(player.getActivePotionEffect(MobEffects.STRENGTH).getAmplifier()+1);
                this.Durtime=String.valueOf(player.getActivePotionEffect(MobEffects.STRENGTH).getDuration());
            }
        }else{
                this.Ampfiler="1";
                this.Durtime="1200";
        }
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)&&!I18n.format(key.concat(".desc")).contains(".desc")){
            for (String i:I18n.format(key.concat(".desc")).split("/n")){
                if(i.contains("<AMP>")){
                    i=i.replaceAll("<AMP>", Ampfiler);
                }
                if(i.contains("<DUR>")){
                    i=i.replaceAll("<DUR>", Durtime);
                }
                System.out.println(i);
                tooltip.add(i);
            }
        }else{
            for (String i:I18n.format(key).split("/n")){
                tooltip.add(i);
            }
        }
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
