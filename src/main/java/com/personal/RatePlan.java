package com.personal;

import java.util.List;

public class RatePlan {

    private String planName;
    private List<Publications> publications;

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public List<Publications> getPublications() {
        return publications;
    }

    public void setPublications(List<Publications> publications) {
        this.publications = publications;
    }

    public void addPublication(Publications publications) {
        this.publications.add(publications);
    }

}
