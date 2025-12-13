package com.personal;

import java.util.List;

public class Organization {
    private String name;
    private List<User> users;
    private RatePlan ratePlan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    public RatePlan getRatePlan() {
        return ratePlan;
    }
    public void setRatePlan(RatePlan ratePlan) {
        this.ratePlan = ratePlan;
    }
}
