package com.h2sxxa.litecraft.event;

import java.util.Random;

import com.h2sxxa.litecraft.init.ModItem;
import com.h2sxxa.litecraft.tool.ICheckInv;
import com.h2sxxa.litecraft.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.Mod_ID)
public final class Listener {

    @SubscribeEvent
    public static void onEventDeath(LivingDeathEvent event)
     {
        ItemStack itemStack = new ItemStack(ModItem.PHOENIX_DOWN);
        if (event.getEntity() instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer)event.getEntity();
            Random r=new Random ();
            Boolean heldcheck = player.getHeldItemMainhand().getItem()==itemStack.getItem() || player.getHeldItemOffhand().getItem()==itemStack.getItem();
            if (event.isCancelable() && heldcheck){
                event.setCanceled(true);
                player.setHealth(player.getMaxHealth());
                if(player.getHeldItemMainhand().getItem()==itemStack.getItem()){
                    player.getHeldItemMainhand().damageItem(1, player);
                }
                else{
                    player.getHeldItemOffhand().damageItem(1, player);
                }
                player.world.playSound(null,player.posX,player.posY,player.posZ, SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.NEUTRAL, 0.5F, 0.4F / (r.nextFloat() * 0.4F + 0.8F));
            }
        }
    }

    @SubscribeEvent
    public static void onGetDamageGhost(LivingDamageEvent event) {
        ItemStack itemStack = new ItemStack(ModItem.GHOST);
        if (event.getEntity() instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer)event.getEntity();
            Random r= new Random();
            int vaule=r.nextInt(5);
            if (player.inventory.hasItemStack(itemStack)&&vaule==0){
                event.setCanceled(true);
                player.world.playSound(null,player.posX,player.posY,player.posZ, SoundEvents.ENTITY_BLAZE_DEATH, SoundCategory.NEUTRAL, 0.5F, 0.4F / (r.nextFloat() * 0.4F + 0.8F));
            }
        }
    }
}
