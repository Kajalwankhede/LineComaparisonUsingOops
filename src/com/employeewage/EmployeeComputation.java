package com.employeewage;
public class EmployeeComputation {
    private int numWorkingDays = 20;
    private int maxHours = 100;
    private int isPartTime = 1;
    private int isFullTime = 2;
    private int wagePerHour = 20;

    EmployeeComputation() {
        System.out.println("\nWelcome to Employee Wage Computation Program");
    }

    @Override
    public String toString() {
        return "EmployeeWageComputation{" +
                "isPartTime=" + isPartTime +
                ", isFullTime=" + isFullTime +
                ", wagePerHour=" + wagePerHour +
                ", numWorkingDays=" + numWorkingDays +
                ", maxHours=" + maxHours +
                '}';
    }

    public static void main(String[] args) {
        EmployeeComputation employee = new EmployeeComputation();
        System.out.println("\n" + employee);
        System.out.println();
        display(calculateSalary(employee));

    }

    private static void display(int[] calculateSalary) {

        int monthlySalary = calculateSalary[0];
        int totalWorkingDays = calculateSalary[1];
        int totalWorkingHours = calculateSalary[2];
        System.out.println();
        System.out.println("Total working days of an Employee : " + totalWorkingDays + "\n");
        System.out.println("Total working hour of an Employee : " + totalWorkingHours + "\n");
        System.out.println("Salary of an Employee in a months : $" + monthlySalary);


    }

    public static int[] calculateSalary(EmployeeComputation employee) {

        //Declaring the variables.
        final int isPartTime = 1;
        final int isFullTime = 2;
        //Declaring the variables
        int randomCheck = 0;
        int empHour=8;
        int wagePerHour = 20;
        int salary = 0;
        int numWorkingDays = 20;
        int monthlySalary = 0;
        int maxHours = 100;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays < employee.numWorkingDays && totalWorkingHours < employee.maxHours) {
            totalWorkingDays++;
            randomCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (randomCheck) {
                case 1:
                    empHour = 4;
                    System.out.println("Employee is Present for Half Day");
                    break;
                case 2:
                    empHour = 8;
                    System.out.println("Employee is Present for Full Day");
                    break;
                default:
                    empHour = 0;
                    System.out.println("Employee is Absent");

            }
            int Total = wagePerHour * empHour;
            System.out.println("Employee Wage is: " + Total);
        }
        if (randomCheck == 0) {
            System.out.println("Employee is absent");
            empHour = 0;
            salary = empHour * employee.wagePerHour;
        } else if (randomCheck == employee.isPartTime) {

            System.out.println("Employee is part-time");
            int partTimeHour = 4;
            empHour = partTimeHour;
            salary = empHour * employee.wagePerHour;
        } else {
            System.out.println("Employee is full-time");
            int fullTimeHour = 8;
            empHour = fullTimeHour;
            salary = empHour * employee.wagePerHour;
        }
        monthlySalary += salary;
        totalWorkingHours += empHour;


        int[] employeeData = {monthlySalary, totalWorkingDays, totalWorkingHours};
        return employeeData;


            }

    }

