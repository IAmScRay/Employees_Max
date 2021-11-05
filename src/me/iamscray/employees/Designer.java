package me.iamscray.employees;

public class Designer extends BaseEmployee {

    private double rate;
    private int workedDays;

    public Designer(long id, String name, String gender, int age, double salary) {
        super(id, name, gender, age, salary);
    }

    public Designer(long id, String name, String gender, int age, double salary, double rate, int workedDays) {
        super(id, name, gender, age, salary);

        this.rate = rate;
        this.workedDays = workedDays;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

    @Override
    public double getTotalSalary() {
        return getDefaultSalary() + rate * workedDays;
    }

    @Override
    public String toString() {
        return "Designer[id=" + getID() + ", name=" + getName() + ", gender=" + getGender() + ", age=" + getAge() + ", defaultSalary= " + getDefaultSalary() + ", rate=" + rate + ", workedDays=" + workedDays + ", totalSalary=" + getTotalSalary() + "]";
    }

}
