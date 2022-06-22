package EmployeeWageDayThree;

public class EmployeeWageUcOne {
    public static void main(String[] args) {
        System.out.println("employee present or not");
        int fullTimePresent = 1;
        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if (employeeCheck == fullTimePresent) {
            System.out.println("employee present");
        } else {
            System.out.println("employee not present");
        }
    }
}
