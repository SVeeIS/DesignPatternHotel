package com.designpattern.hotel;

import java.util.Scanner;
import com.designpattern.hotel.HotelBuilderPattern;
import com.designpattern.hotel.Facade.RoomType;

import com.designpattern.hotel.bridge.FasilitasTambahan;
import com.designpattern.hotel.bridge.ExtraBed;
import com.designpattern.hotel.bridge.Breakfast;
import com.designpattern.hotel.bridge.aDay;
import com.designpattern.hotel.bridge.TwoDays;
import com.designpattern.hotel.bridge.ThreeDays;
import com.designpattern.hotel.bridge.FourDays;
import com.designpattern.hotel.bridge.MoreDays;

import com.designpattern.hotel.template.Fasilitas;
import com.designpattern.hotel.template.deluxeroom;
import com.designpattern.hotel.template.standardroom;
import com.designpattern.hotel.template.suiteroom;

public class PemesananHotel {
    public static void main(String[] args){
        int sarapan, extrabed, roomprice = 0, bfprice = 0, ebprice = 0, type, durasi, totalharga;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Sistem Pemesanan Kamar Hotel XXX");
        System.out.println("--------Pilihan Kamar--------");
        RoomType menu = new RoomType(); // Implementasi Facade Pattern
        menu.StandardRoom();
        menu.DeluxeRoom();
        menu.SuiteRoom();
        
        System.out.println("Tipe Kamar Pilihan Anda : ");
        type = scan.nextInt();
        
        System.out.println("\nBerapa hari anda ingin menginap : ");
        durasi = scan.nextInt();
        
        System.out.println("\nApakah ingin tambahan bed ?");
        System.out.println("1. Yes");
        System.out.println("2. No\nPilihan Anda");
        extrabed = scan.nextInt();
        
        System.out.println("\nApakah ingin sarapan ?");
        System.out.println("1. Yes");
        System.out.println("2. No\nPilihan Anda");
        sarapan = scan.nextInt();
                
        HotelBuilderPattern order = null; // implementasi Builder Pattern
        FasilitasTambahan bf; // Implementasi Bridge Pattern
        FasilitasTambahan eb; // Implementasi Bridge Pattern
        if(extrabed == 1 && sarapan == 1){
            order = new HotelBuilderPattern.HotelBuilder(type, durasi).setSarapan(true).setExtraBed(true).build();
            System.out.println(order);
            if(durasi <= 5){
                ebprice = 150000*durasi;
                bfprice = 150000*durasi;
            }
            else if(durasi > 5){
                ebprice = 150000*5;
                bfprice = 150000*5;
            }
            if(durasi == 1){
                bf = new Breakfast(new aDay());
                bf.applyHarga();
                eb = new ExtraBed(new aDay());
                eb.applyHarga();
            }
            else if(durasi == 2){
                bf = new Breakfast(new TwoDays());
                bf.applyHarga();
                eb = new ExtraBed(new TwoDays());
                eb.applyHarga();
            }
            else if(durasi == 3){
                bf = new Breakfast(new ThreeDays());
                bf.applyHarga();
                eb = new ExtraBed(new ThreeDays());
                eb.applyHarga();
            }
            else if(durasi == 4){
                bf = new Breakfast(new FourDays());
                bf.applyHarga();
                eb = new ExtraBed(new FourDays());
                eb.applyHarga();
            }
            else if(durasi >= 5){
                bf = new Breakfast(new MoreDays());
                bf.applyHarga();
                eb = new ExtraBed(new MoreDays());
                eb.applyHarga();
            }
        }
        else if(extrabed == 1 && sarapan == 2){
            order = new HotelBuilderPattern.HotelBuilder(type, durasi).setExtraBed(true).build();
            System.out.println(order);
            if(durasi <= 5){
                ebprice = 150000*durasi;
            }
            else if(durasi > 5){
                ebprice = 150000*5;
            }
            if(durasi == 1){
                eb = new ExtraBed(new aDay());
                eb.applyHarga();
            }
            else if(durasi == 2){
                eb = new ExtraBed(new TwoDays());
                eb.applyHarga();
            }
            else if(durasi == 3){
                eb = new ExtraBed(new ThreeDays());
                eb.applyHarga();
            }
            else if(durasi == 4){
                eb = new ExtraBed(new FourDays());
                eb.applyHarga();
            }
            else if(durasi >= 5){
                eb = new ExtraBed(new MoreDays());
                eb.applyHarga();
            }
        }
        else if(extrabed == 2 && sarapan == 1){
            order = new HotelBuilderPattern.HotelBuilder(type, durasi).setSarapan(true).build();
            System.out.println(order);
            if(durasi <= 5){
                bfprice = 150000*durasi;
            }
            else if(durasi > 5){
                bfprice = 150000*5;
            }
            if(durasi == 1){
                bf = new Breakfast(new aDay());
                bf.applyHarga();
            }
            else if(durasi == 2){
                bf = new Breakfast(new TwoDays());
                bf.applyHarga();
            }
            else if(durasi == 3){
                bf = new Breakfast(new ThreeDays());
                bf.applyHarga();
            }
            else if(durasi == 4){
                bf = new Breakfast(new FourDays());
                bf.applyHarga();
            }
            else if(durasi >= 5){
                bf = new Breakfast(new MoreDays());
                bf.applyHarga();
            }
        }
        else if(extrabed == 2 && sarapan == 2){
            order = new HotelBuilderPattern.HotelBuilder(type, durasi).build();
            System.out.println(order);
        }  
        
        //implementasi Template Pattern
        Fasilitas room;
        if(type == 1){
            room = new standardroom();
            room.FasKamar();
            roomprice = 275000;
        }
        else if(type == 2){
            room = new deluxeroom();
            room.FasKamar();
            roomprice = 400000;
        }
        else if(type == 3){
            room = new suiteroom();
            room.FasKamar();
            roomprice = 650000;
        }
        
        
        totalharga = (roomprice*durasi) + ebprice + bfprice;
        System.out.println("Total Harga yang Harus Anda Bayar adalah : Rp " + totalharga + ",-");
    }
}
