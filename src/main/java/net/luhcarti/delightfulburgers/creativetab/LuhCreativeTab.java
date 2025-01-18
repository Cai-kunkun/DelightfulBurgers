package net.luhcarti.delightfulburgers.creativetab;


import net.luhcarti.delightfulburgers.DelightfulBurgers;
import net.luhcarti.delightfulburgers.item.LuhItems;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;

@Mod.EventBusSubscriber(modid = DelightfulBurgers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class LuhCreativeTab {
    @SubscribeEvent
    public static void addItemsToCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeTabs.TAB_FARMERS_DELIGHT.get())
            addItemsToFDCreativeTab(event);
    }

    private static void addItemsToFDCreativeTab(BuildCreativeModeTabContentsEvent event) {
        try{
            event.accept(LuhItems.BACON_BURGER);
            event.accept(LuhItems.CHICKEN_BURGER);
            event.accept(LuhItems.DOUBLE_PATTY_BURGER);
            event.accept(LuhItems.BASIC_BURGER);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
