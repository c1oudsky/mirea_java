package com.company;

public class TopManager implements EmployeePosition {
    private Company chosenCompany;
    public void ChooseCompany(Company ChosenCompany) {
        chosenCompany=ChosenCompany;
    }
    private double fixedsalary;
    private double gotmoneys = Math.random() * (115000 - 140000) + 115000;
    TopManager(double fixedsalary) {
        this.fixedsalary=fixedsalary;
    }
    public String getJobTitle() {
        return "TopManager";
    }
    public double income() { return gotmoneys; }
    public double calcSalary() {
        if (chosenCompany != null) {
            if (chosenCompany.getIncome()>10000000) return (fixedsalary+fixedsalary*1.5);
            else return (fixedsalary);
        } else return (fixedsalary);
    }
}