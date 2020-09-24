package com.company;

public class TopManager implements EmployeePosition {
    private double companymoney;
    private double fixedsalary;
    TopManager(double fixedsalary) {
        this.fixedsalary=fixedsalary;
    }
    public String getJobTitle() {
        return "TopManager";
    }
    public double calcSalary() {
        if (companymoney>10000000) return (fixedsalary+fixedsalary*1.5);
        else return (fixedsalary);
    }
}
