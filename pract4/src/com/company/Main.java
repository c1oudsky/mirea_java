package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<EmployeePosition> operators = new ArrayList<EmployeePosition>();
        for(int i=0; i<180; i++) { operators.add(new Operator(50000)); }
        ArrayList<EmployeePosition> managers = new ArrayList<EmployeePosition>();
        for(int i=0; i<80; i++) { managers.add(new Manager(60000)); }
        ArrayList<EmployeePosition> topmanagers = new ArrayList<EmployeePosition>();
        for(int i=0; i<10; i++) { topmanagers.add(new TopManager(70000)); }
        Company company = new Company();
        company.hireAll(operators); company.hireAll(managers); company.hireAll(topmanagers);
        System.out.println("13 самых высоких зарплат в нашей компании:");
        company.WriteSalaries("highest", 13);
        System.out.println("30 самых низких зарплат в нашей компании:");
        company.WriteSalaries("lowest", 30);

    }
}