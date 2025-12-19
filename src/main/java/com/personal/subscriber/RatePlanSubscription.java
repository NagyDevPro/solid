package com.personal.subscriber;

import com.personal.RatePlan;

import java.util.List;

public class RatePlanSubscription implements Subscription {
    private List<RatePlan> ratePlans;

    public RatePlanSubscription(List<RatePlan> ratePlans) {
        this.ratePlans = ratePlans;
    }

    @Override
    public double getPrice(){
        double totalPrice = 0.0;
        for (RatePlan plan : ratePlans) {
            // Assuming a method to get price by rate plan name
            totalPrice += plan.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribed to rate plans: " + String.join(", ", ratePlans.toString()));
    }
    @Override
    public void getDetails() {
        System.out.println("Rate Plan Subscription Details:");
        System.out.println("Rate Plans: " + String.join(", ", ratePlans.toString()));
    }
}
