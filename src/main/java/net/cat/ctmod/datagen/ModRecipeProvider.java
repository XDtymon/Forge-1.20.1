package net.cat.ctmod.datagen;

import net.cat.ctmod.CRTab;
import net.cat.ctmod.block.ModBlocks;
import net.cat.ctmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        /* ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COAL_COKE_BLOCK.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModBlocks.INVAR_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.INVAR_BLOCK.get(), has(ModBlocks.INVAR_BLOCK)))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COAL_COKE, 9)
                .requires(ModBlocks.INVAR_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.INVAR_BLOCK), has(ModBlocks.INVAR_BLOCK.get()))
                .save(pWriter);*/
    }
}
