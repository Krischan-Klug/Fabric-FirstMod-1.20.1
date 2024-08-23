package net.krischan.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.krischan.firstmod.FirstMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //items to add
    public static final Item SWAG = registerItem( "swag", new Item(new FabricItemSettings()) );
    public static final Item MEGA_SWAG = registerItem( "mega_swag", new Item(new FabricItemSettings()) );



    //Add Item to Group
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(SWAG);
        entries.add(MEGA_SWAG);
    }

    //Register Item function
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }
    public static void  registerModItems(){
        FirstMod.LOGGER.info("Registering Mod Items for " + FirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems :: addItemsToIngredientItemGroup);
    }
}
