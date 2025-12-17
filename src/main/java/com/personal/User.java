package com.personal;

import com.personal.subscriber.Subscription;

import java.util.List;

public class User {
    private String name;
    private List<Subscription> subscriptions;

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
