package com.bridgelabz;

public class EmployeeWage {

    static final int IS_FULL_TIME = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages Program");

        int empCheck = (int) (Math.random()*2);
        if(IS_FULL_TIME == empCheck) {
            System.out.println("Employee is Present");
        }else
            System.out.println("Employee is absent.");
    }

}



