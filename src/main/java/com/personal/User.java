package com.personal;

import java.util.List;

public class User {
   private String name;
   private RatePlan ratePlan;
   private List<Publications> publications;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RatePlan getRatePlan() {
        return ratePlan;
    }

    public void setRatePlan(RatePlan ratePlan) {
        this.ratePlan = ratePlan;
    }

    //TODO: think are we here violating solid or not
    public List<Publications> getPublications() {
        return publications;
    }
    public void setPublications(List<Publications> publications) {
        this.publications = publications;
    }
    public void addPublication(Publications publication) {
        this.publications.add(publication);
    }

}
