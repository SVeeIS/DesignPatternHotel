package com.designpattern.hotel.bridge;

public class Breakfast extends FasilitasTambahan{
    public Breakfast(HargaTambahan extra){
        super(extra);
    }
    @Override
    public void applyHarga(){
        System.out.print("Anda menambahkan pilihan sarapan untuk dua orang seharga ");
        ExtraCash.applyHarga();
    }
}
