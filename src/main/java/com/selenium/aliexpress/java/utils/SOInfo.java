package com.selenium.aliexpress.java.utils;

import org.springframework.stereotype.Component;

@Component
public class SOInfo {

    private static String name = System.getProperty("os.name").toLowerCase();

    public static boolean isWindows() {

        return (name.contains("win"));
    }

    public static boolean isLinux() {

        return (name.contains("nux"));
    }

    public static boolean isMac() {

        return (name.contains("mac"));
    }

}
