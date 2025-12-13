package com.personal;

public class OneOffSubscribtion {

    public void subscribe(User user, Publications publications) {
        user.addPublication(publications);
        System.out.println("User: " + user.getName() + "has subscribed to " + publications);
    }

}
