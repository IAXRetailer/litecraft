package com.h2sxxa.litecraft.event;

import com.h2sxxa.litecraft.init.ModItem;
import com.h2sxxa.litecraft.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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
            if (event.isCancelable() && player.inventory.hasItemStack(itemStack)){
                event.setCanceled(true);
                player.setHealth(player.getMaxHealth());
                itemStack.setItemDamage(itemStack.getItemDamage()-1);
        }
    }

    }
}
