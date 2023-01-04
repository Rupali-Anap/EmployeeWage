package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int MAX_WORKING_HOUR = 100;
    static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages Program");

        int totalWorkingDays = 1;
        int totalWage = 0;
        int empWorkingDays=0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= MAX_WORKING_HOUR && totalWorkingDays <= WORKING_DAYS_PER_MONTH) {

            int empCheck=(int) (Math.random()*3);
            int dailyWage = 0;

            switch (empCheck) {
                case IS_FULL_TIME: {
                    System.out.println("Employee is Present full time on day " + totalWorkingDays);
                    dailyWage  = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWage += dailyWage;
                    System.out.println("Total wage after day " + totalWorkingDays + " is : " + totalWage + "\n");
                    totalEmpHrs = totalEmpHrs + FULL_DAY_HOUR;
                    empWorkingDays += 1;
                    break;
                }
                case IS_PART_TIME: {
                    System.out.println("Employee is Present part time on day " + totalWorkingDays);
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWage += dailyWage;
                    System.out.println("Total wage after day " + totalWorkingDays + " is : " + totalWage + "\n");
                    totalEmpHrs = totalEmpHrs + PART_TIME_HOUR;
                    empWorkingDays +=1;
                    break;
                }
                default:
                    System.out.println("Employee is absent.");
                    System.out.println("Total wage after day " + totalWorkingDays + " is : " + totalWage + "\n");
            }
            totalWorkingDays++;
        }

        System.out.println("");
        System.out.println("Employee work for total days is " + empWorkingDays );
        System.out.println("Employee works for total hours is " + totalEmpHrs );
        System.out.println("total salary after working day" +WORKING_DAYS_PER_MONTH+ " is " +totalWage);
    }

}






