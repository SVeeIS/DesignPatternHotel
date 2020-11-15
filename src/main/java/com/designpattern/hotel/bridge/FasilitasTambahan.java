package com.designpattern.hotel.bridge;

public abstract class FasilitasTambahan {
    protected HargaTambahan ExtraCash;
        
    public FasilitasTambahan(HargaTambahan extra){
        this.ExtraCash = extra;
    }
    abstract public void applyHarga();
}
