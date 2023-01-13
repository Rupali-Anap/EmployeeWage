package com.bridgelabz;

public class EmpWageBuilder {

        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        private int numOfCompany = 0;
        private CompanyEmpWage[] companyEmpWageArray;

        public EmpWageBuilder() {
            companyEmpWageArray = new CompanyEmpWage[5];
        }

        private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
            companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
            numOfCompany++;
        }

        private void computeEmpWage() {

            for (int i = 0; i < numOfCompany; i++) {
                companyEmpWageArray[i].setTotalEmpWage(this.computeEmpwage(companyEmpWageArray[i]));
                System.out.println(companyEmpWageArray[i]);
            }
        }

        private int computeEmpwage(CompanyEmpWage companyEmpWage) {
            // Variables
            int emphrs = 0, totalempHrs = 0, totalWorkingDays = 0;
            // Computation
            while (totalempHrs <= companyEmpWage.maxHoursPerMonth &&
                    totalWorkingDays < companyEmpWage.numOfWorkingDays) {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case IS_PART_TIME:
                        emphrs = 4;
                        break;
                    case IS_FULL_TIME:
                        emphrs = 8;
                        break;
                    default:
                        emphrs = 0;
                }
                totalempHrs += emphrs;
                System.out.println("Day#:" + totalWorkingDays + "Emp Hr:" + emphrs);
            }
            return totalempHrs * companyEmpWage.empRatePerHour;
        }

        public static void main(String[] args) {
            EmpWageBuilder empWageBuilder = new EmpWageBuilder();
            empWageBuilder.addCompanyEmpWage("Apple", 20, 20, 200);
            empWageBuilder.addCompanyEmpWage("Samsung", 10, 15, 150);
            empWageBuilder.computeEmpWage();
        }


}
