package com.personal.Subscriber;

import com.personal.User;

public class SubscriptionManager {

    public void subscribeUser(User user, Subscription subscription) {

        subscription.subscribe();

        System.out.println("User " + user.getName() + " has been subscribed to."+ subscription.getClass().getSimpleName());
        subscription.getDetails();
    }
}
