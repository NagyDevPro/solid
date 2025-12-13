package com.personal;

public class RatePlanSubscribtion {

    public void userSubscribe(RatePlan ratePlan,User user) {
            user.setRatePlan(ratePlan);
            System.out.println("User:  " + user + " Subscribed to Rate Plan" + ratePlan);
    }

    public void organizationSubscribe(RatePlan ratePlan,Organization organization) {
        organization.setRatePlan(ratePlan);
        for(var user: organization.getUsers()){
            userSubscribe(ratePlan,user);
        }
        System.out.println("Organization:  " + organization + " Subscribed to Rate Plan" + ratePlan);
    }
}
