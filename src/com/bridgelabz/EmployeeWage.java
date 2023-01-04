package com.bridgelabz;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int IS_FULL_TIME = 1;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages Program");

        int dailyWage = 0;
        int empCheck = (int) (Math.random()*2);
        if(IS_FULL_TIME == empCheck) {
            System.out.println("Employee is Present");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Wage of the employee is: " + dailyWage);
        }else {
            System.out.println("Employee is absent.");
            System.out.println("Wage of the employee is: " + dailyWage);
        }
    }

}




