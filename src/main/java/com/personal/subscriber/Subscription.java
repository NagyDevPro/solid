package com.personal.subscriber;

public interface Subscription {

    public double getPrice();
    public void subscribe();

    public default void getDetails(){
        System.out.println("No Details have been provided.....");
    }
}
