package com.personal;

import com.personal.Subscriber.OneOffSubscription;

import java.util.List;

public class RatePlan {

    private String planName;
    private List<Publications> publications;
    private double price;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public List<Publications> getPublications() {
        return publications;
    }


}
