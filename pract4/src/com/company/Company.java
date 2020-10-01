package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    public void hire(Employee emp) {
        employees.add(emp);
        emp.job.ChooseCompany(this);
    }
    public void hireAll(ArrayList<Employee> emps) {
        employees.addAll(emps);
        for(int i=0; i<emps.size(); i++) {
            emps.get(i).job.ChooseCompany(this);
        }
    }
    public void fire(Employee emp) {
        employees.remove(emp);
        emp.job.ChooseCompany(null);
    }
    public double getAllSalaries() {
        double outcome=0;
        for(int i=0; i<employees.size(); i++) {
            outcome+=employees.get(i).job.calcSalary();
        }
        return outcome;
    }
    public double getIncome() {
        double getting=0;
        for(int i=0; i<employees.size(); i++) {
            getting += employees.get(i).job.income();
        }
        //getting -= getAllSalaries();  | насколько я понял, доход компании высчитывается без вычитания выплачиваемых ей зарплат
        return getting;
    }
    public void useThanos() {
        for(int i=0; i<employees.size()/2; i++) employees.remove(employees.get(i));
        System.out.println(getIncome());
    }
    public ArrayList<Employee> getTopSalaryStaff(int count) {
        if (count > 0) {
            if (count > employees.size()) count = employees.size();
            ArrayList<Employee> list = new ArrayList<Employee>();
            list.addAll(employees);
            for (int ii = 0; ii < (list.size() - 1); ii++) {
                for (int i = 0; i < (list.size() - 1); i++) {
                    if (list.get(i).job.calcSalary() < list.get(i + 1).job.calcSalary())
                        Collections.swap(list, i, i + 1);
                }
            }
            int listlength = list.size();
            for (int i = count; i < listlength; i++) { list.remove(count); }
            return list;
        } else return null;
    }
    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        if (count > 0) {
            if (count > employees.size()) count = employees.size();
            ArrayList<Employee> list = new ArrayList<Employee>();
            list.addAll(employees);
            for (int ii = 0; ii < (list.size() - 1); ii++) {
                for (int i = 0; i < (list.size() - 1); i++) {
                    if (list.get(i).job.calcSalary() > list.get(i + 1).job.calcSalary())
                        Collections.swap(list, i, i + 1);
                }
            }
            int listlength = list.size();
            for (int i = count; i < listlength; i++) { list.remove(count);}
            return list;
        } else return null;
    }
    public void WriteSalaries(String par1, int par2) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        if (par1=="lowest") { list.addAll(getLowestSalaryStaff(par2)); }
        if (par1=="highest") { list.addAll(getTopSalaryStaff(par2)); }
        for(int i=0; i<list.size(); i++) System.out.println(list.get(i).job.calcSalary() + " руб.");
    }
}