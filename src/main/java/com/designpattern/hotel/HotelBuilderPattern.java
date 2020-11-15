
package com.designpattern.hotel;

public class HotelBuilderPattern {
    //wajib
    private int TipeKamar;
    private int LamaMenginap;
    private String RoomType;
    
    //opsional
    private boolean Sarapan;
    private boolean ExtraBed;

    public int getTipeKamar() {
        return TipeKamar;
    }

    public int getLamaMenginap() {
        return LamaMenginap;
    }

    public boolean isSarapan() {
        return Sarapan;
    }

    public boolean isExtraBed() {
        return ExtraBed;
    }

    public HotelBuilderPattern(HotelBuilder builder) {
        this.TipeKamar = builder.TipeKamar;
        this.LamaMenginap = builder.LamaMenginap;
        this.Sarapan = builder.Sarapan;
        this.ExtraBed = builder.ExtraBed;
    }

    public static class HotelBuilder{
        //wajib
        private int TipeKamar;
        private int LamaMenginap;
        //opsional
        private boolean Sarapan;
        private boolean ExtraBed;
        
        public HotelBuilder(int roomtype, int durasi){
            this.TipeKamar= roomtype;
            this.LamaMenginap = durasi;
        }
        public HotelBuilder setSarapan(boolean breakfast){
            this.Sarapan = breakfast;
            return this;
        }
        
        public HotelBuilder setExtraBed(boolean extrabed){
            this.ExtraBed = extrabed;
            return this;
        }
        
        public HotelBuilderPattern build(){
            return new HotelBuilderPattern(this);
        }
        
    }
    
    public String toString(){
        return "Anda Menginap pada kamar tipe " + TipeKamar + " selama " + LamaMenginap + " hari";
    }
}
