package com.h2sxxa.litecraft.util.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.h2sxxa.litecraft.init.ModItem;
import com.h2sxxa.litecraft.util.IHasModel;

@EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItem.ITEMS.toArray(new Item[0]));
        //System.out.println("Regist litecraft Item;");
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Item item: ModItem.ITEMS){
            if(item instanceof IHasModel) {
                ((IHasModel)item).registerModels();
                //System.out.println("Regist litecraft Model;");
            }
        }
    }
}
