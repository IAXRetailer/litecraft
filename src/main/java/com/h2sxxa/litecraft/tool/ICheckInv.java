package com.h2sxxa.litecraft.tool;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ICheckInv {
    public static Boolean ICheckEMP(EntityPlayer player) {
        for (ItemStack itemStack:player.inventory.mainInventory){
            if(itemStack == ItemStack.EMPTY){
                return true;
            }
        }
        return false;
    }
}
