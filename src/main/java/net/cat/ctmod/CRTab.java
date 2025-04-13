package net.cat.ctmod;

import net.cat.ctmod.block.ModBlocks;
import net.cat.ctmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CRTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CatTech.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tab_1",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ELECTRUM_INGOT.get()))
                    .title(Component.translatable("creativetab.tab_1"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.INVAR_BLOCK.get());
                        pOutput.accept(ModItems.INVAR_INGOT.get());

                        pOutput.accept(ModBlocks.ELECTRUM_BLOCK.get());
                        pOutput.accept(ModItems.ELECTRUM_INGOT.get());

                        pOutput.accept(ModBlocks.LUMIUM_BLOCK.get());
                        pOutput.accept(ModItems.LUMIUM_INGOT.get());

                        pOutput.accept(ModBlocks.SIGNALUM_BLOCK.get());
                        pOutput.accept(ModItems.SIGNALUM_INGOT.get());

                        pOutput.accept(ModBlocks.ENDERIUM_BLOCK.get());
                        pOutput.accept(ModItems.ENDERIUM_INGOT.get());

                        pOutput.accept(ModItems.ALUMIUNIUM_INGOT.get());

                        pOutput.accept(ModItems.BRONZE_INGOT.get());

                        pOutput.accept(ModItems.CONSTANTAN_INGOT.get());

                        pOutput.accept(ModItems.IRIDIUM_INGOT.get());

                        pOutput.accept(ModItems.LEAD_INGOT.get());

                        pOutput.accept(ModItems.NICKEL_INGOT.get());

                        pOutput.accept(ModItems.PLATINUM_INGOT.get());

                        pOutput.accept(ModItems.SILVER_INGOT.get());

                        pOutput.accept(ModBlocks.TIN_BLOCK.get());
                        pOutput.accept(ModItems.TIN_INGOT.get());

                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                        pOutput.accept(ModItems.STEEL_INGOT.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
