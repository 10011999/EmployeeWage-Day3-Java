package EmployeeWageDayThree;

public class EmployeeWageTwo {
    public static void main(String[] args) {
        int fullTime = 1;
        int perHour = 20;
        int empHour = 0;
        int empWage = 0;
        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if (employeeCheck == fullTime) {
            System.out.println(empHour = 8);
        } else {
            System.out.println(empWage = 0);
        }
        empWage = empHour * perHour;
        System.out.println(empWage);
    }
}