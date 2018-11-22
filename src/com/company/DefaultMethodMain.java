package com.company;

import com.company.defautmethod.GalaxyDeviceImpl;
import com.company.defautmethod.IPhoneDeviceImpl;

public class DefaultMethodMain
{

    public static void main(String[] args)
    {
        GalaxyDeviceImpl galaxy = new GalaxyDeviceImpl();
        IPhoneDeviceImpl iphone = new IPhoneDeviceImpl();

        System.out.println("iPhone OS : " + iphone.getOS());
        System.out.println("Galaxy OS : " + galaxy.getOS());

    }
}
