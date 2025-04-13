package net.cat.ctmod.item.custom;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class FuelItem extends Item{
    private int burnTime = 0;

    public FuelItem (Properties pProperities, int burnTime) {
        super (pProperities);
        this.burnTime = burnTime;
    }

    @Override

    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }
}
