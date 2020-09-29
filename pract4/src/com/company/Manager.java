package com.company;

public class Manager implements EmployeePosition{
    private Company chosenCompany;
    public void ChooseCompany(Company ChosenCompany) {
        chosenCompany=ChosenCompany;
    }
    private double fixedsalary;
    private double gotmoneys = Math.random() * (115000 - 140000) + 115000;
    Manager(double fixedsalary) {
        this.fixedsalary=fixedsalary;
    }
    public String getJobTitle() {
        return "Manager";
    }
    public double calcSalary() {
        return (fixedsalary + gotmoneys*0.05);
    }
    public double income() { return gotmoneys; }
}