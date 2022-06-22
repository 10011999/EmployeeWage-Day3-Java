package EmployeeWageDayThree;

public class EmployeeWageUcFive {

    public static final int partTime = 1;
    public static final int fullTime = 2;
    public static final int perHour = 20;
    public static final int noOfWorkingDay = 2;

    public static void main(String[] args) {
        int empHour = 0;
        int empWage = 0;
        int totalEmpwage = 0;
        int dTwo;
        for (dTwo = 0; dTwo < noOfWorkingDay; dTwo++) {
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
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
            empWage = empHour * perHour;
            totalEmpwage = +empWage;
            System.out.println("emp wage: " + empWage);
        }
        System.out.println("totalEmpWage" + totalEmpwage);
    }
}