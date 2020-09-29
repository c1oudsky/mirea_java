package com.company;

public class Operator implements EmployeePosition {
    private Company chosenCompany;
    public void ChooseCompany(Company ChosenCompany) {
        chosenCompany=ChosenCompany;
    }
    private double fixedsalary;
    private double gotmoneys = Math.random() * (115000 - 140000) + 115000;
    Operator(double fixedsalary) {
        this.fixedsalary=fixedsalary;
    }
    public String getJobTitle() {
        return "Operator";
    }
    public double calcSalary() {
        return (fixedsalary);
    }
    public double income() { return gotmoneys; }
}