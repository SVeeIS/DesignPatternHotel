package com.designpattern.hotel.template;

public class deluxeroom extends Fasilitas{
    @Override
    public void TempatTidur(){
        System.out.println("- 1 Double Bed");
    }
    @Override
    public void KamarMandi(){
        System.out.println("- Shower dengan Air Panas");
    }
    @Override
    public void Luas(){
        System.out.println("- Luas Kamar : 28 m2");
    }
}
