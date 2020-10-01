package com.company;

public class Employee {
    public String sirname, name;
    public EmployeePosition job;

    Employee(String sirname, String name, EmployeePosition job) {
        this.sirname = sirname;
        this.name = name;
        this.job = job;
    }
}