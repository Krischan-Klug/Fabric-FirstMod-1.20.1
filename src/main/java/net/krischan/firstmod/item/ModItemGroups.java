package net.krischan.firstmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.krischan.firstmod.FirstMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SWAG_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FirstMod.MOD_ID, "swag"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.swag"))
            .icon(() -> new ItemStack(ModItems.SWAG)).entries((displayContext, entries) -> {
                entries.add(ModItems.SWAG);
                entries.add(ModItems.MEGA_SWAG);


                    } ).build() );

    public static void registerItemGroups(){
        FirstMod.LOGGER.info("Registering Item Groups for " + FirstMod.MOD_ID);
    }
}
