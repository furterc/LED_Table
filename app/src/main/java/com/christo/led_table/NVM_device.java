package com.christo.led_table;

import java.util.Date;


public class NVM_device
{
    private static NVM_device ourInstance = new NVM_device();

    static NVM_device getInstance()
    {
        return ourInstance;
    }

    private int displayHeight;
    private int displayWidth;

    void setDisplayHeight(int displayHeight)
    {
        getInstance().displayHeight = displayHeight;
    }

    int getDisplayHeight()
    {
        return displayHeight;
    }

    void setDisplayWidth(int getDisplayWidth)
    {
        getInstance().displayWidth = getDisplayWidth;
    }

    int getDisplayWidth()
    {
        return displayWidth;
    }
}