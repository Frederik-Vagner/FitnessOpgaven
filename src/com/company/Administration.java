package com.company;

public class Administration extends Employee {

    int hours = 37;
    int salary = 33000;
    int vacation = 5;


    public Administration(String name, String cpr) {
        super(name, cpr);

    }

    @Override
    public String toString() {
        return name +" " + cpr +" "+ hours +" "+ salary +" "+ vacation;
    }
}
