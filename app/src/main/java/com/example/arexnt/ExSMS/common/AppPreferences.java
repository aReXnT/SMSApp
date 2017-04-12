package com.example.arexnt.ExSMS.common;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.arexnt.ExSMS.enums.AppPreference;

public abstract class AppPreferences {
    private static SharedPreferences sPrefs;

    public static void init(Context context) {
        sPrefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static boolean getBoolean(AppPreference preference) {
        return sPrefs.getBoolean(preference.getKey(), (boolean) preference.getDefaultValue());
    }
    
    public static void setBoolean(AppPreference preference, boolean newValue) {
        sPrefs.edit().putBoolean(preference.getKey(), newValue).apply();
    }

    public static int getInt(AppPreference preference) {
        return sPrefs.getInt(preference.getKey(), (int) preference.getDefaultValue());
    }

    public static void setInt(AppPreference preference, int newValue) {
        sPrefs.edit().putInt(preference.getKey(), newValue).apply();
    }

    public static long getLong(AppPreference preference) {
        return sPrefs.getLong(preference.getKey(), (int) preference.getDefaultValue());
    }

    public static void setLong(AppPreference preference, long newValue) {
        sPrefs.edit().putLong(preference.getKey(), newValue).apply();
    }

    public static String getString(AppPreference preference) {
        return sPrefs.getString(preference.getKey(), (String) preference.getDefaultValue());
    }

    public static void setString(AppPreference preference, String newValue) {
        sPrefs.edit().putString(preference.getKey(), newValue).apply();
    }
}
