package io.springboot2.x.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class NetflixPlanDTO {

    private String planId;
    private String planName;
    private String pricePerMonth;
    private String featuresProvide;


    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerMonth(String pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public String getFeaturesProvide() {
        return featuresProvide;
    }

    public void setFeaturesProvide(String featuresProvide) {
        this.featuresProvide = featuresProvide;
    }
}
