package me.iamscray;

import me.iamscray.employees.BaseEmployee;

import java.util.Arrays;

public class EmployeeService {

    private BaseEmployee[] employees;

    public EmployeeService() {}

    public EmployeeService(BaseEmployee[] employees) {
        this.employees = employees;
    }

    public BaseEmployee[] getEmployees() {
        return employees;
    }

    public void setEmployees(BaseEmployee[] employees) {
        this.employees = employees;
    }

    public BaseEmployee getByID(long id) {
        for(BaseEmployee employee : employees) {
            if(employee.getID() == id) {
                return employee;
            }
        }

        return null;
    }

    public BaseEmployee getByName(String name) {
        for(BaseEmployee employee : employees) {
            if(employee.getName().equals(name)) {
                return employee;
            }
        }

        return null;
    }

    public void printEmployees() {
        for(BaseEmployee e : employees) {
            System.out.println(e);
        }
        System.out.print("\n");
    }

    public double calculateSalaryAndBonus() {
        double result = 0;

        for(BaseEmployee employee : employees) {
            result += employee.getTotalSalary();
        }

        return result;
    }

    public void sortByName() {
        Arrays.sort(employees, me.iamscray.employees.BaseEmployee::compareByName);
    }

    public void sortByNameAndSalary() {
        Arrays.sort(employees, BaseEmployee::compareByNameAndSalary);
    }

    public void addEmployee(BaseEmployee employee) {
        BaseEmployee[] result = Arrays.copyOf(employees, employees.length + 1);
        result[result.length - 1] = employee;

        employees = result;
    }

    public BaseEmployee removeEmployee(long id) {
        int index = -1;

        for(int i = 0; i < employees.length; i++) {
            if(employees[i].getID() == id) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            return null;
        }

        BaseEmployee result = employees[index];
        employees[index] = null;

        employees = Arrays.copyOf(employees, employees.length - 1);

        return result;
    }

    public BaseEmployee editEmployee(BaseEmployee newE) {
        int index = -1;

        for(int i = 0; i < employees.length; i++) {
            if(employees[i].getID() == newE.getID()) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            return null;
        }

        BaseEmployee oldE = employees[index];
        employees[index] = newE;

        return oldE;
    }

}
