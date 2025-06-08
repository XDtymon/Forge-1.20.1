package net.cat.ctmod.util;


import net.cat.ctmod.CatTech;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ORE_PROSPECTOR_ORES = tag("ore_prospector_ores");


        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(CatTech.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(CatTech.MOD_ID, name));
        }
    }
}
