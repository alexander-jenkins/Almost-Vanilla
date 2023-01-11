package dev.alexjenkins.almost_vanilla.items;

import dev.alexjenkins.almost_vanilla.AlmostVanilla;
import dev.alexjenkins.almost_vanilla.materials.OakArmorMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AVItems {

    // testing items
    public static final Item DEBUG_ITEM = new Item(new FabricItemSettings().maxCount(1));

    // oak armor
    public static final ArmorMaterial OAK_ARMOR = new OakArmorMaterial();
    public static final ArmorItem OAK_HELMET = new ArmorItem(OAK_ARMOR, EquipmentSlot.HEAD, new Item.Settings());
    public static final ArmorItem OAK_CHESTPLATE = new ArmorItem(OAK_ARMOR, EquipmentSlot.CHEST, new Item.Settings());
    public static final ArmorItem OAK_LEGGINGS = new ArmorItem(OAK_ARMOR, EquipmentSlot.LEGS, new Item.Settings());
    public static final ArmorItem OAK_BOOTS = new ArmorItem(OAK_ARMOR, EquipmentSlot.FEET, new Item.Settings());

    public static void register() {
        AlmostVanilla.LOGGER.info("Registering items:");

        // debug_item
        Registry.register(Registries.ITEM, new Identifier(AlmostVanilla.MOD_ID, "debug_item"), DEBUG_ITEM);
        ItemGroupEvents.modifyEntriesEvent(AVItemGroup.AV).register(entries -> entries.add(DEBUG_ITEM));
        AlmostVanilla.LOGGER.info(String.format("- %s:%s", AlmostVanilla.MOD_ID, DEBUG_ITEM));

        // oak_helmet
        Registry.register(Registries.ITEM, new Identifier(AlmostVanilla.MOD_ID, "oak_helmet"), OAK_HELMET);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(Items.LEATHER_BOOTS, OAK_HELMET));
        AlmostVanilla.LOGGER.info(String.format("- %s:%s", AlmostVanilla.MOD_ID, OAK_HELMET));

        // oak_chestplate
        Registry.register(Registries.ITEM, new Identifier(AlmostVanilla.MOD_ID, "oak_chestplate"), OAK_CHESTPLATE);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(OAK_HELMET, OAK_CHESTPLATE));
        AlmostVanilla.LOGGER.info(String.format("- %s:%s", AlmostVanilla.MOD_ID, OAK_CHESTPLATE));

        // oak_leggings
        Registry.register(Registries.ITEM, new Identifier(AlmostVanilla.MOD_ID, "oak_leggings"), OAK_LEGGINGS);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(OAK_CHESTPLATE, OAK_LEGGINGS));
        AlmostVanilla.LOGGER.info(String.format("- %s:%s", AlmostVanilla.MOD_ID, OAK_LEGGINGS));

        // oak_boots
        Registry.register(Registries.ITEM, new Identifier(AlmostVanilla.MOD_ID, "oak_boots"), OAK_BOOTS);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(OAK_LEGGINGS, OAK_BOOTS));
        AlmostVanilla.LOGGER.info(String.format("- %s:%s", AlmostVanilla.MOD_ID, OAK_BOOTS));
    }
}
