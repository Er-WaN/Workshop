package com.company.defautmethod;

public interface DeviceAPI
{
    default boolean isBluetoothEnable()
    {
        // default method implementation goes here
    }

    String getOS();
}
