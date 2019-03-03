package com.kate.stubMockTesting;

public class Restorant {
    private String restirantName;
    private int totalCapacity;
    private int freecapacity;

    public String getRestirantName() {
        return restirantName;
    }

    public void setRestirantName(String restirantName) {
        this.restirantName = restirantName;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getFreecapacity() {
        return freecapacity;
    }

    public void setFreecapacity(int freecapacity) {
        this.freecapacity = freecapacity;
    }

    public int[] capacity(){
        return new int[] {freecapacity, totalCapacity};
    }
}
