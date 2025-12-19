package com.personal.subscriber;

import com.personal.Publications;

public class OneOffSubscription implements Subscription{
    private Publications publication;

    public OneOffSubscription(Publications publication) {
        this.publication = publication;
    }

    @Override
    public double getPrice() {
        return publication.getPrice();
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribed to one-off publication: " + publication.getTitle());
    }

    @Override
    public void getDetails() {
        System.out.println("One-off Subscription Details:");
        System.out.println("Title: " + publication.getTitle());
        System.out.println("Author: " + publication.getAuthor());
    }



}
