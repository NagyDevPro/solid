package com.personal.Subscriber;

import com.personal.Publications;

import java.util.List;

public class OneOffSubscription implements Subscription {
    private Publications publication;

    public OneOffSubscription(Publications publication) {
        this.publication = publication;
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribed to one-off publication: " + publication.getTitle());
    }


}
