package com.myapplicationdev.android.p02_holidays;

public class Holiday {
    private String name;
    private boolean icon;

    public Holiday(String holiday, boolean icon) {
        this.name = holiday;
        this.icon = icon;
    }
    public String getHoliday() {
        return name;
    }
    public boolean isIcon() {
        return icon;
    }
}
