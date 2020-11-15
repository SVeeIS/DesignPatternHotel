package com.designpattern.hotel.Facade;

public class Suite implements Hotel{
    @Override
        public void TipeKamar(){
            System.out.println("3. \tSuite Room");
        }
        @Override
        public void Harga(){
            System.out.println("\t(Rp 650.000,-/Malam)");
        }
}
