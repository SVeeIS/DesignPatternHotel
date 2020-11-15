package com.designpattern.hotel.Facade;

public class Deluxe implements Hotel{
    @Override
    public void TipeKamar(){
        System.out.println("2. \tDeluxe Room");
    }
    @Override
    public void Harga(){
        System.out.println("\t(Rp 400.000,-/Malam)");
    }
}
