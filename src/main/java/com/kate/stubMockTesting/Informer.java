package com.kate.stubMockTesting;

public class Informer {
    private Restorant restorant;

    public Informer(Restorant restorant) {
        this.restorant = restorant;
    }

    public String restInfo(){
        String restInfostring;
        restInfostring = String.format("Restorant Name: %s with full capacity %d and free capacity %d",restorant.getRestirantName(),restorant.getTotalCapacity(),restorant.getFreecapacity());
        return restInfostring;
    }
}
