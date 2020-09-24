package com.company;

public class Operator implements EmployeePosition {
    private double fixedsalary;
    Operator(double fixedsalary) {
        this.fixedsalary=fixedsalary;
    }
    public String getJobTitle() {
        return "Operator";
    }
    public double calcSalary() {
        return (fixedsalary);
    }
}
