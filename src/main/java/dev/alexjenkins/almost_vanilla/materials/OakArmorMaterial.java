package dev.alexjenkins.almost_vanilla.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

public class OakArmorMaterial implements ArmorMaterial {
    private final String name = "oak";
    private final int durabilityMultiplier = 10;
    private final int[] protectionAmounts = new int[] {2, 3, 4, 2};
    private final int enchantability = 12;
    private final SoundEvent equipSound = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    private final float toughness = 0.0f;
    private final float knockbackResistance = 0.0f;
    private final Lazy<Ingredient> repairIngredientSupplier = new Lazy<Ingredient>(() -> Ingredient.ofItems(Items.OAK_PLANKS));
    private final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
