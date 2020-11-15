package com.designpattern.hotel.Facade;

public class RoomType {
    private Hotel standard;
        private Hotel deluxe;
        private Hotel suite;
        
        public RoomType(){
            standard = new Standard();
            deluxe = new Deluxe();
            suite = new Suite();
        }
        public void StandardRoom(){
            standard.TipeKamar();
            standard.Harga();
        }
        public void DeluxeRoom(){
            deluxe.TipeKamar();
            deluxe.Harga();
        }
        public void SuiteRoom(){
            suite.TipeKamar();
            suite.Harga();
        }
}
