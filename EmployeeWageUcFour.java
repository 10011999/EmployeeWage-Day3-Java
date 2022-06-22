package EmployeeWageDayThree;

public class EmployeeWageUcFour {
    public static final int partTime = 1;
    public static final int fullTime = 2;
    public static final int perHour = 20;

    public static void main(String[] args) {
        int empHour = 0;
        int empWage = 0;
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 2;
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
        System.out.println("emp wage: " + empWage);
    }
}
