package com.example.android.bluetoothlegatt;

import java.util.HashMap;

public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();

    static {
        attributes.put("0000ffe1-0000-1000-8000-00805f9b34fb", "Motion Data");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
