package com.frostdev.sukamus.database;

import android.provider.BaseColumns;

public class DatabaseContract {

    static String TABLE_ENGLISH = "tb_inggris";
    static String TABLE_INDONESIA = "tb_indonesia";

    static final class KamusColumns implements BaseColumns {

        static String KATA = "kata";
        static String DESKRIPSI = "deskripsi";

    }
}
