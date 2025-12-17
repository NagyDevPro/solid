package com.personal.subscriber;

import java.util.List;

public class RatePlanSubscription implements Subscription {
    private List<String> ratePlans;

    public RatePlanSubscription(List<String> ratePlans) {
        this.ratePlans = ratePlans;
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribed to rate plans: " + String.join(", ", ratePlans));
    }
    @Override
    public void getDetails() {
        System.out.println("Rate Plan Subscription Details:");
        System.out.println("Rate Plans: " + String.join(", ", ratePlans));
    }
}
