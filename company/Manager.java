package com.company;

public class Manager implements EmployeePosition{
    private double fixedsalary;
    Manager(double fixedsalary) {
        this.fixedsalary=fixedsalary;
    }
    public String getJobTitle() {
        return "Manager";
    }
    public double calcSalary() {
        return (fixedsalary+ (Math.random() * (115000 - 140000) + 115000));
    }
}

