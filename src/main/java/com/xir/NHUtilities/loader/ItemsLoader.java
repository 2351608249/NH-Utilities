package com.xir.NHUtilities.loader;

import static com.xir.NHUtilities.common.api.enums.NHUItemList.WIRELESS_DYNAMO_COVERS;
import static com.xir.NHUtilities.common.api.enums.NHUItemList.WIRELESS_ENERGY_COVERS;
import static com.xir.NHUtilities.common.api.enums.TexturesSets.OVERLAY_WIRELESS_1024A;
import static com.xir.NHUtilities.config.Config.enableEggMachine;
import static com.xir.NHUtilities.config.Config.enableEternityVial;
import static com.xir.NHUtilities.config.Config.enableGluttonyRingAndHungerRing;
import static com.xir.NHUtilities.config.Config.enableLunchBoxPlus;
import static com.xir.NHUtilities.config.Config.enableTimeVial;

import com.xir.NHUtilities.common.api.MTOBuilder;
import com.xir.NHUtilities.common.api.NHUCreativeTabs;
import com.xir.NHUtilities.common.api.enums.NHUItemList;
import com.xir.NHUtilities.common.blocks.CustomDragonEgg;
import com.xir.NHUtilities.common.blocks.metaBlockImpl.MetaBlock;
import com.xir.NHUtilities.common.items.aItemCore.MetaItemBase;
import com.xir.NHUtilities.common.items.baubles.GluttonyRing;
import com.xir.NHUtilities.common.items.baubles.HungerRing;
import com.xir.NHUtilities.common.items.baubles.KamiRing;
import com.xir.NHUtilities.common.items.baubles.WarpWardRing;
import com.xir.NHUtilities.common.items.covers.WirelessCovers;
import com.xir.NHUtilities.common.items.itemFuelRod.FuelRod;
import com.xir.NHUtilities.common.items.itemFuelRod.FuelRodDepleted;
import com.xir.NHUtilities.common.items.lunchBoxPlus.LunchBoxPlus;
import com.xir.NHUtilities.common.items.metaItemImpl.MetaItem;
import com.xir.NHUtilities.common.items.timeVial.EternityVial;
import com.xir.NHUtilities.common.items.timeVial.TimeVial;
import com.xir.NHUtilities.common.items.wand.foci.ItemFocusTape;

import gregtech.api.GregTechAPI;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Mods;
import gregtech.api.render.TextureFactory;

public class ItemsLoader {

    static final boolean testThings = true;

    public static void initNHUtilitiesItems() {

        // region Common Item
        NHUItemList.TimeVial.setAndRegister(TimeVial::new, enableTimeVial);
        NHUItemList.EternityVial.setAndRegister(EternityVial::new, enableEternityVial);
        NHUItemList.KamiRing.setAndRegister(KamiRing::new, testThings);
        NHUItemList.HungerRing.setAndRegister(HungerRing::new, enableGluttonyRingAndHungerRing);
        NHUItemList.GluttonyRing.setAndRegister(GluttonyRing::new, enableGluttonyRingAndHungerRing);
        NHUItemList.WarpWardRing.setAndRegister(WarpWardRing::new, testThings);
        NHUItemList.FocusTape.setAndRegister(ItemFocusTape::new, testThings);
        if (enableLunchBoxPlus && Mods.SpiceOfLife.isModLoaded())
            NHUItemList.LunchBoxPlus.setAndRegister(new LunchBoxPlus());
        // endregion

        // region Fuel Rod
        NHUItemList.RodRadianceUraniumDepleted.setAndRegister(new FuelRodDepleted("RodRadianceUraniumDepleted", 100));
        NHUItemList.RodRadianceUraniumDepleted2.setAndRegister(new FuelRodDepleted("RodRadianceUraniumDepleted2", 200));
        NHUItemList.RodRadianceUraniumDepleted4.setAndRegister(new FuelRodDepleted("RodRadianceUraniumDepleted4", 400));
        NHUItemList.RodRadianceUranium.setAndRegister(
            new FuelRod(
                "RodRadianceUranium",
                1,
                37500,
                72,
                4000,
                86400,
                0F,
                NHUItemList.RodRadianceUraniumDepleted.get(1)));
        NHUItemList.RodRadianceUranium2.setAndRegister(
            new FuelRod(
                "RodRadianceUranium2",
                2,
                37500,
                72,
                4000,
                86400,
                0F,
                NHUItemList.RodRadianceUraniumDepleted2.get(1)));
        NHUItemList.RodRadianceUranium4.setAndRegister(
            new FuelRod(
                "RodRadianceUranium4",
                4,
                37500,
                72,
                4000,
                86400,
                0F,
                NHUItemList.RodRadianceUraniumDepleted4.get(1)));
        NHUItemList.RodPrimordialPearlPlutoniumDepleted
            .setAndRegister(new FuelRodDepleted("RodPrimordialPearlPlutoniumDepleted", 1600));
        NHUItemList.RodPrimordialPearlPlutoniumDepleted2
            .setAndRegister(new FuelRodDepleted("RodPrimordialPearlPlutoniumDepleted2", 3200));
        NHUItemList.RodPrimordialPearlPlutoniumDepleted4
            .setAndRegister(new FuelRodDepleted("RodPrimordialPearlPlutoniumDepleted4", 6400));
        NHUItemList.RodPrimordialPearlPlutonium.setAndRegister(
            new FuelRod(
                "RodPrimordialPearlPlutonium",
                1,
                274000,
                2000,
                12800,
                40000,
                36.3F,
                NHUItemList.RodPrimordialPearlPlutoniumDepleted.get(1)));
        NHUItemList.RodPrimordialPearlPlutonium2.setAndRegister(
            new FuelRod(
                "RodPrimordialPearlPlutonium2",
                2,
                274000,
                2000,
                12800,
                40000,
                36.3F,
                NHUItemList.RodPrimordialPearlPlutoniumDepleted2.get(1)));
        NHUItemList.RodPrimordialPearlPlutonium4.setAndRegister(
            new FuelRod(
                "RodPrimordialPearlPlutonium4",
                4,
                274000,
                2000,
                12800,
                40000,
                36.3F,
                NHUItemList.RodPrimordialPearlPlutoniumDepleted4.get(1)));
        // endregion

        // region Common Block
        NHUItemList.ChaosDragonEgg.setAndRegister(() -> new CustomDragonEgg("ChaosDragonEgg"), enableEggMachine);
        NHUItemList.AncientDragonEgg.setAndRegister(() -> new CustomDragonEgg("AncientDragonEgg"), enableEggMachine);
        // endregion

        // region Meta Item
        NHUItemList.MetaItem.setMetaObject(
            MTOBuilder.newBuilder(new MetaItem())
                .addRegisterAction(MetaItem::loadMetaItem)
                .build());
        NHUItemList.MetaBlock.setMetaObject(
            MTOBuilder.newBuilder(new MetaBlock())
                .addRegisterAction(MetaBlock::loadMetaItem)
                .build());
        NHUItemList.WirelessCoverItems.setMetaObject(
            MTOBuilder.newBuilder(new MetaItemBase("WirelessCoverItem"))
                .addRegisterAction(t -> t.setCreativeTab(NHUCreativeTabs.WirelessMisc))
                // region meta id 1 -> 14 for wireless dynamo cover
                // reversed id [0] for wireless cover things
                // t.addMetaItem("WirelessCoverTest", 0);
                .addRegisterAction(t -> {
                    for (int i = 0; i < 14; i++) {
                        var value = WIRELESS_DYNAMO_COVERS[i];
                        value.set(t.addMetaItem(value.name(), i + 1));
                    }
                })
                // endregion
                // region meta id 15 -> 28 for wireless energy cover
                .addRegisterAction(t -> {
                    for (int i = 0; i < 14; i++) {
                        var value = WIRELESS_ENERGY_COVERS[i];
                        value.set(t.addMetaItem(value.name(), i + 14 + 1));
                    }
                })
                // endregion
                .addRegisterAction(t -> {
                    var coverTexture = TextureFactory
                        .of(TextureFactory.of(OVERLAY_WIRELESS_1024A, new short[] { 255, 255, 255, 0 }));
                    for (int i = 0; i < 14; i++) {
                        GregTechAPI.registerCover(
                            WIRELESS_DYNAMO_COVERS[i].get(1),
                            coverTexture,
                            new WirelessCovers.CoverWirelessDynamo((int) GTValues.V[i + 1]));
                    }
                    for (int i = 0; i < 14; i++) {
                        GregTechAPI.registerCover(
                            WIRELESS_ENERGY_COVERS[i].get(1),
                            coverTexture,
                            new WirelessCovers.CoverWirelessEnergy((int) GTValues.V[i + 1]));
                    }
                })
                .build());
        // endregion

    }

}
