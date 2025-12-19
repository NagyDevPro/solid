package com.personal;

import com.personal.subscriber.Subscription;

import java.util.List;

public class User {
    private String name;
    private List<Subscription> subscriptions;
    private double balance;

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void deductBalance(double amount) {
        setBalance(this.balance - amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void addSubscription(Subscription subscription) {
        this.subscriptions.add(subscription);
    }


}
