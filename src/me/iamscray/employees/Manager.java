package me.iamscray.employees;

public class Manager extends BaseEmployee {

    public Manager(long id, String name, String gender, int age, double salary) {
        super(id, name, gender, age, salary);
    }

    @Override
    public double getTotalSalary() {
        return getDefaultSalary();
    }

    @Override
    public String toString() {
        return "Manager[id=" + getID() + ", name=" + getName() + ", gender=" + getGender() + ", age=" + getAge() + ", defaultSalary= " + getDefaultSalary() + ", totalSalary=" + getTotalSalary() + "]";
    }

}
