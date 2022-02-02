package com.selenium.aliexpress.java.driver;

import com.selenium.aliexpress.java.utils.SOInfo;

public abstract class AbstractDriverLoader {

    public static final String WIN32 = "win";

    public static final String LINUX32 = "linux32";

    public static final String MAC32 = "mac32";

    public static final String UNKNOWN = "unknown";

    protected String resolveInternalSo() {

        if (SOInfo.isWindows()) {
            return WIN32;
        } else if (SOInfo.isLinux()) {
            return LINUX32;
        } else if (SOInfo.isMac()) {
            return MAC32;
        } else {
            return UNKNOWN;
        }
    }

    protected String normalizeDriverExtension(String path){
        return SOInfo.isWindows() ? path + ".exe" : path;
    }

}
