package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String divider = "***************************************************";

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Administration("Anders", "120799-1214"));
        employees.add(new Administration("Malte", "240699-1111"));
        employees.add(new Instructor("Tim", "301298-1117", 40));
        employees.add(new Instructor("Jesper", "010199-1016", 35));
        System.out.println("FitnessEmployees");
        System.out.println("Name " + "Cpr " + "Hours " + "Salary " + "Vacation");
        System.out.println(divider);
        for (Employee i : employees){
            System.out.println(i);
        }

        System.out.println();

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member("Hasan", "122497-1617", true));
        members.add(new Member("Mik", "241299-1516", true));
        members.add(new Member("Marcus", "121200-1211", false));
        System.out.println("FitnessMembers");
        System.out.println("Navn  " + "Cpr    " + "MemberType    " + "MemberFee");
        System.out.println(divider);
        for (Member i : members){
            System.out.println(i);
        }

        System.out.println();

        System.out.println("Employees & Members Name and Cpr");
        System.out.println("Name " + "  Cpr");
        System.out.println(divider);
        for (Employee i : employees){
            System.out.println(i.getName() +" " + i.getCpr());
        }
        for (Member i : members){
            System.out.println(i.getName() +" " + i.getCpr());
        }


        }

}
