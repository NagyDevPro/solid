package com.personal.Subscriber;

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
}
