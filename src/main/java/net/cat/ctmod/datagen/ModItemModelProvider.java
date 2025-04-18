package net.cat.ctmod.datagen;

import net.cat.ctmod.CatTech;
import net.cat.ctmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CatTech.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ALUMINIUM_NUGGET);
        simpleItem(ModItems.BRONZE_NUGGET);
        simpleItem(ModItems.CONSTANTAN_NUGGET);
        simpleItem(ModItems.COPPER_NUGGET);
        simpleItem(ModItems.DIAMOND_NUGGET);
        simpleItem(ModItems.ELECTRUM_NUGGET);
        simpleItem(ModItems.EMERALD_NUGGET);
        simpleItem(ModItems.INVAR_NUGGET);
        simpleItem(ModItems.IRIDIUM_NUGGET);
        simpleItem(ModItems.LEAD_NUGGET);
        simpleItem(ModItems.LUMIUM_NUGGET);
        simpleItem(ModItems.NICKEL_NUGGET);
        simpleItem(ModItems.PLATINUM_NUGGET);
        simpleItem(ModItems.SILVER_NUGGET);
        simpleItem(ModItems.STEEL_NUGGET);
        simpleItem(ModItems.TIN_NUGGET);




    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CatTech.MOD_ID, "item/" + item.getId().getPath()));


    }
}
