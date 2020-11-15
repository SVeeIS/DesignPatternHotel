package com.designpattern.hotel.template;

public class standardroom extends Fasilitas{
    @Override
    public void TempatTidur(){
        System.out.println("- 2 Single Beds");
    }
    @Override
    public void KamarMandi(){
        System.out.println("- Shower dengan Air Panas");
    }
    @Override
    public void Luas(){
        System.out.println("- Luas Kamar : 21 m2");
    }
}
