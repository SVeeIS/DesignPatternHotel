package com.designpattern.hotel.Facade;

public class Standard implements Hotel{
    @Override
    public void TipeKamar(){
        System.out.println("1. \tStandard Room");
    }
    @Override
    public void Harga(){
        System.out.println("\t(Rp 275.000,-/Malam)");
    }
}
