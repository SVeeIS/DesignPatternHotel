package com.designpattern.hotel.template;

public abstract class Fasilitas {
    public final void FasKamar(){
        System.out.println("Fasilitas yang anda dapatkan pada kamar yang anda pilih adalah : ");
        Hiburan();
        TempatTidur();
        KamarMandi();
        Tersedia();
        Luas();
    }
    
    private void Hiburan(){
        System.out.println("- Free Wi-Fi, TV 32 inci, Telephone");
    }
    public abstract void TempatTidur();
    public abstract void KamarMandi();
    private void Tersedia(){
        System.out.println("- Sudah tersedia Lemari, Handuk, Peralatan Mandi, Sendal, Meja, Pemanas Air, Kopi Teh Gula, dan Sudah tersedia balkon disetiap kamar untuk anda menikmati pemandangan kota");
    }
        
    public abstract void Luas();
}
