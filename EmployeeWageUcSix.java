package EmployeeWageDayThree;

public class EmployeeWageUcSix {

        public static final int partTime = 1;
        public static final int fullTime = 2;
        public static final int perHour = 20;
        public static final int noOfWday = 2;
        public static final int maxHrsMon = 100;

        public static void main (String[]args){
            int empHour = 0;
            int empWage = 0;
            int totalEmpwage = 0;
            int totalEhour = 0;
            int totalWday = 0;
            while (totalEhour <= maxHrsMon && totalWday < noOfWday){
                int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
                totalWday++;
                switch (employeeCheck) {
                    case partTime:
                        System.out.println(empHour = 8);
                        break;
                    case fullTime:
                        System.out.println(empWage = 8);
                        break;
                    default:
                        System.out.println(empHour = 0);
                }
                totalEhour += empHour;
                System.out.println("day: " + totalWday + "emphour" +empHour);
            }
            int totalEmployeeWage = totalEhour + empHour;
            System.out.println("totalEmpWage" + totalEmployeeWage);
        }
    }
