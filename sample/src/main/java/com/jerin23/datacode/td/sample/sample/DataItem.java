package com.jerin23.datacode.td.sample.sample;

import android.graphics.drawable.Drawable;

/**
 * Created by Miguel on 27/11/2017.
 */

public class DataItem {

    private String label;

    private Drawable drawable;

    private int navigationInfo;

    public DataItem(String label, Drawable drawable, int navigationInfo) {
        this.label = label;
        this.drawable = drawable;
        this.navigationInfo = navigationInfo;
    }

    public String getLabel() {
        return label;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public int getNavigationInfo() {
        return navigationInfo;
    }
}
