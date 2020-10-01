package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Operator operator = new Operator(50000);
        Manager manager = new Manager(60000);
        TopManager topmanager = new TopManager(70000);
        ArrayList<Employee> operators = new ArrayList<Employee>();
        for(int i=0; i<180; i++) { operators.add(new Employee("Операторский", ("Операнд"+ (i+1) ), operator) ); }
        ArrayList<Employee> managers = new ArrayList<Employee>();
        for(int i=0; i<80; i++) { managers.add(new Employee("Управляющий",  ("Ментимер"+ (i+1) ), manager) ); }
        ArrayList<Employee> topmanagers = new ArrayList<Employee>();
        for(int i=0; i<10; i++) { topmanagers.add(new Employee("Топ",  ("Степан"+ (i+1) ), topmanager) ); }
        Company company = new Company();
        company.hireAll(operators); company.hireAll(managers); company.hireAll(topmanagers);
        System.out.println("13 самых высоких зарплат в нашей компании:");
        company.WriteSalaries("highest", 13);
        System.out.println("30 самых низких зарплат в нашей компании:");
        company.WriteSalaries("lowest", 30);

    }
}