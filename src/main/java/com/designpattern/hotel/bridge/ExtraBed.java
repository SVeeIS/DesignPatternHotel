package com.designpattern.hotel.bridge;

public class ExtraBed extends FasilitasTambahan{
    public ExtraBed(HargaTambahan extra){
        super(extra);
    }
    @Override
    public void applyHarga(){
        System.out.print("Anda menambahkan pilihan extra bed dengan harga ");
        ExtraCash.applyHarga();
    }
}
