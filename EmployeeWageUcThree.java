package EmployeeWageDayThree;

public class EmployeeWageUcThree {
    public static void main(String[] args) {
        int partTime = 1;
        int fullTime = 2;
        int perHour = 20;
        int empHour = 0;
        int empWage = 0;
        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if (employeeCheck == partTime) {
            System.out.println(empHour = 8);
        } else if (employeeCheck == fullTime) {
            System.out.println(empWage = 8);
        } else {
            System.out.println(empHour = 0);
        }
        empWage = empHour * perHour;
        System.out.println("emp wage: "+empWage);
    }
}
