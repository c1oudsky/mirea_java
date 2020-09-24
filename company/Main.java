package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager(50000);
        TopManager topmanager = new TopManager(60000);
        Operator operator = new Operator(40000);
        Employee emp1 = new Employee("Ivanov","Ivan", manager);
        Employee emp2 = new Employee("IIvanov","Ivan", topmanager);
        Employee emp3 = new Employee("IIIvanov","Ivan", operator);
        System.out.println(emp1.job.getJobTitle());
        System.out.println(emp1.job.calcSalary());
        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(emp1);
        Company company = new Company();

    }
}
