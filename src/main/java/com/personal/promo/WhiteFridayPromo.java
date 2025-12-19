package com.personal.promo;

public class WhiteFridayPromo implements Promotion {

    @Override
    public double apply(double price) {
        return price * 0.7; // 30% discount
    }

}
