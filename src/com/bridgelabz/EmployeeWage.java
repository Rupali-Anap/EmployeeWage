package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;


    static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages Program");

        int dayCount = 1;
        int totalWage = 0;

        while (dayCount<=WORKING_DAYS_PER_MONTH) {
            int empCheck=(int) (Math.random()*3);
            int dailyWage = 0;

            switch (empCheck) {
                case IS_FULL_TIME: {
                    System.out.println("Employee is Present full time on day " + dayCount);
                    dailyWage  = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWage += dailyWage;
                    System.out.println("Total wage after day " + dayCount + " is : " + totalWage + "\n");
                    break;
                }
                case IS_PART_TIME: {
                    System.out.println("Employee is Present part time on day " + dayCount);
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWage += dailyWage;
                    System.out.println("Total wage after day " + dayCount + " is : " + totalWage + "\n");
                    break;
                }
                default: {
                    System.out.println("Employee is absent on day " + dayCount);
                    System.out.println("Total wage after day " + dayCount + " is : " + totalWage + "\n");
                }
            }
            dayCount++;
        }

        System.out.println("Total salary of the employee after " + WORKING_DAYS_PER_MONTH + " days is : " + totalWage);

    }

}






