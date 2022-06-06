package com.h2sxxa.litecraft.tool;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ICheckInv {
    public static Boolean ICheckStack(EntityPlayer player,Item item) {
        ItemStack itemStack = new ItemStack(item);
        for (int i = 0;i<=player.inventory.getSizeInventory();i++){
            if(player.inventory.getStackInSlot(i).getItem() == itemStack.getItem()){
                return true;
            }
        }
        return false;
    }
}
