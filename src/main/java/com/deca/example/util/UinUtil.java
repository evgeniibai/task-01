package com.deca.example.util;

import java.util.UUID;

public final class UinUtil {

    private UinUtil() {
    }

    public static String uin() {
        String uin = UUID.randomUUID().toString();
        return uin.substring(0, 8);
    }
}
