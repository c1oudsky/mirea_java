package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<Employee>();;
    public void hire(Employee emp) {
        employees.add(emp);
    }
    public void hireAll(ArrayList<Employee> emps) {
        employees.addAll(emps);
    }
    public void fire(Employee emp) {
        employees.remove(emp);
    }
    public double getIncome() {
        double outcome=0;
        for(int i=0; i<employees.size(); i++) {
            outcome+=employees.get(i).job.calcSalary();
        }
        return outcome;
    }
    public void useThanos() {
        for(int i=0; i<employees.size()/2; i++) employees.remove(employees.get(i));
        System.out.println(getIncome());
    }
    public ArrayList<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> list;
        list=employees;
        for(int ii=0; ii<(list.size()-1); ii++) {
            for(int i=0; i<(list.size()-1); i++) {
                if (list.get(i).job.calcSalary()<list.get(i+1).job.calcSalary())
                    Collections.swap(list, i, i+1);
            }
        }
        for(int i=count; i<list.size(); i++) list.remove(list.get(i));
        return list;
    }
    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        ArrayList<Employee> list;
        list=employees;
        for(int ii=0; ii<(list.size()-1); ii++) {
            for(int i=0; i<(list.size()-1); i++) {
                if (list.get(i).job.calcSalary()>list.get(i+1).job.calcSalary())
                    Collections.swap(list, i, i+1);
            }
        }
        for(int i=count; i<list.size(); i++) list.remove(list.get(i));
        return list;
    }
}
