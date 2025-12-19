package com.personal.subscriber;

import com.personal.User;
import com.personal.promo.Promotion;

public class SubscriptionManager {

    public void subscribeUser(User user, Subscription subscription, Promotion promotion) {

        double currnetBalance = user.getBalance();
        double subscriptionPrice = subscription.getPrice();
        if(promotion != null) {
            subscriptionPrice = applyPromotion(subscription, promotion);
        }
        user.deductBalance(currnetBalance - subscriptionPrice);
        subscription.subscribe();

        System.out.println("User " + user.getName() + " has been subscribed to."+ subscription.getClass().getSimpleName());
        subscription.getDetails();
    }
    private double applyPromotion(Subscription subscription, Promotion promotion){
        double originalPrice = subscription.getPrice();
        return promotion.apply(originalPrice);
    }
    public void promotionInquiry(Subscription subscription, Promotion promotion){
        double discountedPrice = applyPromotion(subscription, promotion);
        System.out.println("Discounted Price after applying promotion: " + discountedPrice);
    }
    public void subtractSubscriptionFee(User user, double amount) {
        double currentBalance = user.getBalance();
        user.deductBalance(currentBalance - amount);
        System.out.println("Subscription fee of " + amount + " has been deducted from user " + user.getName() + "'s balance.");
    }

}
