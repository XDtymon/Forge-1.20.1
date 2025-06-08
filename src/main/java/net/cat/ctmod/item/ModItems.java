package net.cat.ctmod.item;

import net.cat.ctmod.CatTech;
import net.cat.ctmod.block.ModBlocks;
import net.cat.ctmod.item.custom.FuelItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CatTech.MOD_ID);

    public static final RegistryObject<Item> INVAR_INGOT = ITEMS.register("invar_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INVAR_NUGGET = ITEMS.register("invar_nugget",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SIGNALUM_INGOT = ITEMS.register("signalum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SIGNALUM_NUGGET = ITEMS.register("signalum_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LUMIUM_INGOT = ITEMS.register("lumium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LUMIUM_NUGGET = ITEMS.register("lumium_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERIUM_NUGGET = ITEMS.register("enderium_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER_ORE = ITEMS.register("raw_silver_ore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_NICKEL_ORE = ITEMS.register("raw_nickel_ore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CONSTANTAN_INGOT = ITEMS.register("constantan_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CONSTANTAN_NUGGET = ITEMS.register("constantan_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));










    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new FuelItem(new Item.Properties(),16000));
    public static final RegistryObject<Item> FUEL_BLOCK_ITEM = ModItems.ITEMS.register("coal_coke_block",
            () -> new BlockItem(ModBlocks.COAL_COKE_BLOCK.get(),
                    new Item.Properties()) {
                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 16000;
                }
            });


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
