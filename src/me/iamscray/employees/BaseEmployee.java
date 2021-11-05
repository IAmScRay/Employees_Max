package me.iamscray.employees;

import java.util.Comparator;

public abstract class BaseEmployee {

    private long id;
    private String name;

    private String gender;
    private int age;

    private double defaultSalary;

    public BaseEmployee() {}

    public BaseEmployee(long id, String name, String gender, int age, double defaultSalary) {
        this.id = id;
        this.name = name;

        this.gender = gender;
        this.age = age;

        this.defaultSalary = defaultSalary;
    }

    public long getID() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDefaultSalary() {
        return defaultSalary;
    }

    public void setDefaultSalary(double defaultSalary) {
        this.defaultSalary = defaultSalary;
    }

    public abstract double getTotalSalary();

    @Override
    public String toString() {
        return "BaseEmployee[id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", defaultSalary=" + defaultSalary + "]";
    }

    public int compareByName(BaseEmployee e) {
        return getName().compareTo(e.getName());
    }

    public int compareByNameAndSalary(BaseEmployee e) {
        return Comparator.comparing(me.iamscray.employees.BaseEmployee::getTotalSalary).thenComparing(me.iamscray.employees.BaseEmployee::getName).compare(this, e);
    }

}
