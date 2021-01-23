package com.Amalitech;

public class FooCorporation {
    private int hoursWorked;
    private double basePay;

    public final double MINIMUM_WAGE = 8.0;
    public final double OVERTIME_RATE = 1.5;


    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    public void getTotalPay(double basePay, int hoursWorked) {
        setBasePay(basePay);
        setHoursWorked(hoursWorked);
        double baseSalary = getBasePay();
        int hours = getHoursWorked();
        double employeePay;
        double overtime, totalPay;

        if ((hours % 40 == hours) || (hours % 40 == 0)){
            employeePay = hours * baseSalary;
        }else{
            employeePay = 40 * baseSalary;
        }


        if (hours % 40 == hours) {
            overtime = 0;
        } else {
            overtime = baseSalary * OVERTIME_RATE;
        }

        totalPay = employeePay + overtime;
        if (baseSalary < MINIMUM_WAGE ){
            System.out.println("ERROR, base pay $" + baseSalary + " is less than the  minimum wage " + MINIMUM_WAGE);
        }else if (hours > 60){
            System.out.println("ERROR, hours " + hours + " is greater than 60");
        }

        else{
            System.out.println("Employee's base pay is : $" + baseSalary + " hours worked: " + hours
                    + " Total salary is: $" + totalPay);
        }



    }
}
