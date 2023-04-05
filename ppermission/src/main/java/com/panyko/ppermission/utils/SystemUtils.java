package com.panyko.ppermission.utils;

import android.os.Build;

public class SystemUtils {
    /**
     * 系统版本大于等于13
     * @return
     */
    public static boolean isEqualsOrGreaterThanAndroid13() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU;
    }
    /**
     * 系统版本小于等于13
     * @return
     */
    public static boolean isEqualsOrLessThanAndroid13() {
        return Build.VERSION.SDK_INT <= Build.VERSION_CODES.TIRAMISU;
    }

    /**
     * 系统版本大于等于12
     * @return
     */
    public static boolean isEqualsOrGreaterThanAndroid12() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.S;
    }
    /**
     * 系统版本小于等于12
     * @return
     */
    public static boolean isEqualsOrLessThanAndroid12() {
        return Build.VERSION.SDK_INT <= Build.VERSION_CODES.S;
    }
    /**
     * 系统版本大于等于11
     * @return
     */
    public static boolean isEqualsOrGreaterThanAndroid11() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.R;
    }
    /**
     * 系统版本小于等于11
     * @return
     */
    public static boolean isEqualsOrLessThanAndroid11() {
        return Build.VERSION.SDK_INT <= Build.VERSION_CODES.R;
    }
    /**
     * 系统版本大于等于10
     * @return
     */
    public static boolean isEqualsOrGreaterThanAndroid10() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q;
    }
    /**
     * 系统版本小于等于10
     * @return
     */
    public static boolean isEqualsOrLessThanAndroid10() {
        return Build.VERSION.SDK_INT <= Build.VERSION_CODES.Q;
    }
    /**
     * 系统版本大于等于9
     * @return
     */
    public static boolean isEqualsOrGreaterThanAndroid9() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.P;
    }
    /**
     * 系统版本小于等于9
     * @return
     */
    public static boolean isEqualsOrLessThanAndroid9() {
        return Build.VERSION.SDK_INT <= Build.VERSION_CODES.P;
    }
    /**
     * 系统版本大于等于8
     * @return
     */
    public static boolean isEqualsOrGreaterThanAndroid8() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.O;
    }
    /**
     * 系统版本小于等于8
     * @return
     */
    public static boolean isEqualsOrLessThanAndroid8() {
        return Build.VERSION.SDK_INT <= Build.VERSION_CODES.O;
    }
    /**
     * 系统版本大于等于7
     * @return
     */
    public static boolean isEqualsOrGreaterThanAndroid7() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N;
    }
    /**
     * 系统版本小于等于7
     * @return
     */
    public static boolean isEqualsOrLessThanAndroid7() {
        return Build.VERSION.SDK_INT <= Build.VERSION_CODES.N;
    }

    /**
     * 系统版本大于等于6
     * @return
     */
    public static boolean isEqualsOrGreaterThanAndroid6() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
    }
    /**
     * 系统版本小于等于6
     * @return
     */
    public static boolean isEqualsOrLessThanAndroid6() {
        return Build.VERSION.SDK_INT <= Build.VERSION_CODES.M;
    }

}
