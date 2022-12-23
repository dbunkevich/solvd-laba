package com.solvd.travel.document;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class InsurancePolicy {

    private Integer policyNumber;
    private String company;
    private LocalDate beginDate;
    private LocalDate endDate;
    private Float cost;

    public InsurancePolicy(Integer policyNumber, String company, Float cost){
        this.policyNumber=policyNumber;
        this.company=company;
        this.cost=cost;
    }

    public static Set<String> policies = new LinkedHashSet<>();

    public Integer getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(Integer policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }
}
