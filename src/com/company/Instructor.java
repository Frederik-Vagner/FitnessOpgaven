package com.company;

public class Instructor extends Employee{
    int salaryPerHour = 199;
    int hours;



    public Instructor(String name, String cpr, int hours) {
        super(name, cpr);
        this.hours = hours;
    }


    @Override
    public String toString() {
        return name + " " + cpr + " " + hours + " " + (hours* salaryPerHour);
    }
}
