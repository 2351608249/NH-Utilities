package com.xir.NHUtilities.common.api.enums;

import static com.xir.NHUtilities.config.Config.metaIdOffset;

public enum MetaTileEntityID {

    TC_BLAST_FURNACE(0),
    EGG_MACHINE_LV(1),
    EGG_MACHINE_MV(2),
    EGG_MACHINE_HV(3),
    EGG_MACHINE_EV(4),
    EGG_MACHINE_IV(5),
    EGG_MACHINE_LuV(6),
    EGG_MACHINE_ZPM(7),
    EGG_MACHINE_UV(8),
    EGG_MACHINE_UHV(9),
    EGG_MACHINE_UEV(10),
    EGG_MACHINE_UIV(11),
    EGG_MACHINE_UMV(12),
    EGG_MACHINE_UXV(13),
    EGG_MACHINE_MAX(14),

    ;

    public final int ID;

    MetaTileEntityID(int ID) {
        this.ID = 25000 + metaIdOffset + ID;
    }
}
