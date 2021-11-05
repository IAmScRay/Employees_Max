package me.iamscray.employees;

import java.util.Random;

public class Developer extends BaseEmployee {

    private int fixedBugs;

    public Developer(long id, String name, String gender, int age, double salary) {
        super(id, name, gender, age, salary);
    }

    public Developer(long id, String name, String gender, int age, double salary, int fixedBugs) {
        super(id, name, gender, age, salary);

        this.fixedBugs = fixedBugs;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    @Override
    public double getTotalSalary() {
        return (getDefaultSalary() + fixedBugs * (Math.random() * 10D)) * (new Random().nextBoolean() ? 2 : 0);
    }

    @Override
    public String toString() {
        return "Developer[id=" + getID() + ", name=" + getName() + ", gender=" + getGender() + ", age=" + getAge() + ", defaultSalary= " + getDefaultSalary() + ", fixedBugs=" + fixedBugs + ", totalSalary=" + getTotalSalary() + "]";
    }

}
