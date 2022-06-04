package com.h2sxxa.litecraft.item.EffectItem;

import java.util.List;
import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemTreature extends OneUseItemBase{
    Random rand;
    List<Item> pool;
    public ItemTreature(String name, CreativeTabs tab, PotionEffect effect, int cooldowntick,int Usetime,List<Item> pool) {
        super(name, tab, effect, cooldowntick, Usetime);
        this.pool=pool;
        this.rand=new Random();
        
    }
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!player.world.isRemote && player.inventory.hasItemStack(ItemStack.EMPTY))
        {
            player.getHeldItem(hand).shrink(Usetime);
            Item itemelementItem = pool.get(rand.nextInt(pool.size()));
            ItemStack itemStack = new ItemStack(itemelementItem);
            player.addItemStackToInventory(itemStack);
        }
        return EnumActionResult.SUCCESS;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
    {

        if (!player.world.isRemote && player.inventory.hasItemStack(ItemStack.EMPTY)){
            player.getHeldItem(handIn).shrink(Usetime);
            //System.out.println(pool.get(rand.nextInt(pool.size())));
            Item itemelementItem = pool.get(rand.nextInt(pool.size()));
            ItemStack itemStack = new ItemStack(itemelementItem);
            player.addItemStackToInventory(itemStack);
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));

    }
}
