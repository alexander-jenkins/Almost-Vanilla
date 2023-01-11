package dev.alexjenkins.almost_vanilla.items;

import dev.alexjenkins.almost_vanilla.AlmostVanilla;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AVItemGroup {
    public static final ItemGroup AV = FabricItemGroup.builder(
            new Identifier(AlmostVanilla.MOD_ID, "av_group"))
            .icon(() -> new ItemStack(AVItems.DEBUG_ITEM))
            .build();
}
