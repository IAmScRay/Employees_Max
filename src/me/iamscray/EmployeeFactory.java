package me.iamscray;

import me.iamscray.employees.BaseEmployee;
import me.iamscray.employees.Designer;
import me.iamscray.employees.Developer;
import me.iamscray.employees.Manager;

import java.util.Random;

public class EmployeeFactory {

    public static final String[] males = {
        "Paul",
        "Peter",
        "Pedro",
        "Michael"
    };

    public static final String[] females = {
        "Anna",
        "Michelle",
        "Kara",
        "Lisa"
    };

    public static final String[] possibleEmployees = {
        "Developer",
        "Designer",
        "Manager"
    };

    public static BaseEmployee[] generateEmployees(int size) {
        BaseEmployee[] result = new BaseEmployee[size];

        for(int i = 0; i < size; i++) {
            Random rand = new Random();

            long id = Math.abs(rand.nextLong());
            String name = "";
            String gender = "";

            if(rand.nextBoolean()) {
                name = males[rand.nextInt(males.length - 1)];
                gender = "Male";
            } else {
                name = females[rand.nextInt(females.length - 1)];
                gender = "Female";
            }

            int age = (int) (rand.nextDouble() * (60 - 20 + 1) + 20);
            double salary = rand.nextDouble() * 10000D;

            BaseEmployee e = null;

            String position = possibleEmployees[rand.nextInt(possibleEmployees.length)];
            switch (position) {
                case "Developer":
                    e = new Developer(id, name, gender, age, salary);
                    ((Developer) e).setFixedBugs(10);
                    break;
                case "Designer":
                    e = new Designer(id, name, gender, age, salary);
                    ((Designer) e).setRate(15);
                    ((Designer) e).setWorkedDays(28);
                    break;
                default:
                    e = new Manager(id, name, gender, age, salary);
                    break;
            }

            result[i] = e;
        }

        return result;
    }

}
