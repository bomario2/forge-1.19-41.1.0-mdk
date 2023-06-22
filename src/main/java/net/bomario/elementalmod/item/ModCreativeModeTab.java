package net.bomario.elementalmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ELEMENTAL_TAB = new CreativeModeTab("elementaltab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WATER_TRIDENT.get());
        }
    };
}
