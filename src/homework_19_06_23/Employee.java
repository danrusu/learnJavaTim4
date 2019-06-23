package homework_19_06_23;

import fundamentals.Freelancer;

public class Employee {
    private Freelancer freelancer;

    private String name;
    private int age;
    private char sex;
    private String employer;
    private double salary;
    private String level;

    public Employee(String name, int age, char sex, String employer) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.employer = employer;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public String getEmployer() {
        return employer;
    }

    public double getSalary() {
        return salary;
    }

    public String getLevel() {
        return level;
    }

    public void increaseAge(int amount) {
        this.age += amount;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    // Employee: John, 30 years, male, works at IBM
    @Override
    public String toString() {

        String employeeSexString = "female";

        if (sex == 'M') employeeSexString = "male";

        return "Employee: "
                + name + ", "
                + age + " years, "
                + employeeSexString + ", works at "
                + employer
                + ", salary: " + salary
                + ", LEVEL: " + level;


    }
}
