package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Company {
    private ArrayList<EmployeePosition> employees = new ArrayList<EmployeePosition>();
    public void hire(EmployeePosition emp) {
        employees.add(emp);
        emp.ChooseCompany(this);
    }
    public void hireAll(ArrayList<EmployeePosition> emps) {
        employees.addAll(emps);
        for(int i=0; i<emps.size(); i++) {
            emps.get(i).ChooseCompany(this);
        }
    }
    public void fire(EmployeePosition emp) {
        employees.remove(emp);
        emp.ChooseCompany(null);
    }
    public double getAllSalaries() {
        double outcome=0;
        for(int i=0; i<employees.size(); i++) {
            outcome+=employees.get(i).calcSalary();
        }
        return outcome;
    }
    public double getIncome() {
        double getting=0;
        for(int i=0; i<employees.size(); i++) {
           getting += employees.get(i).income();
        }
        //getting -= getAllSalaries();  | насколько я понял, доход компании высчитывается без вычитания выплачиваемых ей зарплат
        return getting;
    }
    public void useThanos() {
        for(int i=0; i<employees.size()/2; i++) employees.remove(employees.get(i));
        System.out.println(getIncome());
    }
    public ArrayList<EmployeePosition> getTopSalaryStaff(int count) {
        if (count > 0) {
            if (count > employees.size()) count = employees.size();
            ArrayList<EmployeePosition> list = new ArrayList<EmployeePosition>();
            list.addAll(employees);
            for (int ii = 0; ii < (list.size() - 1); ii++) {
                for (int i = 0; i < (list.size() - 1); i++) {
                    if (list.get(i).calcSalary() < list.get(i + 1).calcSalary())
                        Collections.swap(list, i, i + 1);
                }
            }
            int listlength = list.size();
            for (int i = count; i < listlength; i++) { list.remove(count); }
            return list;
        } else return null;
    }
    public ArrayList<EmployeePosition> getLowestSalaryStaff(int count) {
        if (count > 0) {
            if (count > employees.size()) count = employees.size();
            ArrayList<EmployeePosition> list = new ArrayList<EmployeePosition>();
            list.addAll(employees);
            for (int ii = 0; ii < (list.size() - 1); ii++) {
                for (int i = 0; i < (list.size() - 1); i++) {
                    if (list.get(i).calcSalary() > list.get(i + 1).calcSalary())
                        Collections.swap(list, i, i + 1);
                }
            }
            int listlength = list.size();
            for (int i = count; i < listlength; i++) { list.remove(count);}
            return list;
        } else return null;
    }
    public void WriteSalaries(String par1, int par2) {
        ArrayList<EmployeePosition> list = new ArrayList<EmployeePosition>();
        if (par1=="lowest") { list.addAll(getLowestSalaryStaff(par2)); }
        if (par1=="highest") { list.addAll(getTopSalaryStaff(par2)); }
        for(int i=0; i<list.size(); i++) System.out.println(list.get(i).calcSalary() + " руб.");
    }
}