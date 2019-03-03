package com.kate.stubMockTesting;

public class Main {

    public static void main(String[] args) {
        Restorant firstRestorant = new Restorant();
        firstRestorant.setRestirantName("FirstOne");
        firstRestorant.setTotalCapacity(100);
        firstRestorant.setFreecapacity(20);
        Informer firstInformer = new Informer(firstRestorant);
        System.out.println(firstInformer.restInfo());
    }

}
