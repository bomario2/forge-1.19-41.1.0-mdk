package net.bomario.elementalmod.item;

import net.bomario.elementalmod.ElementalMod;
import net.bomario.elementalmod.item.custom.WaterTridentItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElementalMod.MOD_ID);

    public static final RegistryObject<Item> WATER_TRIDENT = ITEMS.register("water_trident",
            () -> new WaterTridentItem(new Item.Properties().tab(ModCreativeModeTab.ELEMENTAL_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}
