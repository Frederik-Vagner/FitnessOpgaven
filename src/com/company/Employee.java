package com.company;

public class Employee extends Person{
    int hours;
    int salary;

    public Employee(String name, String cpr) {
        super(name, cpr);
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }
}
