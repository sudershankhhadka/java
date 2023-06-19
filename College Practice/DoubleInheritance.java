//This a piece of code signifying the double layered inheritance in Java lang.

import java.util.Timer;

class Factory{
    private String EmployeeName;
    private int EmployeeCount;
    private double EmployeeWage;

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getEmployeeCount() {
        return EmployeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        EmployeeCount = employeeCount;
    }

    public double getEmployeeWage() {
        return EmployeeWage;
    }

    public void setEmployeeWage(double employeeWage) {
        EmployeeWage = employeeWage;
    }
}


//First Branching of the superclass Factory

class Holiday extends Factory{
    public int getHoliday() {
        return Holiday;
    }

    public void setHoliday(int holiday) {
        Holiday = holiday;
    }

    private int Holiday;
}


//Second Branching of Superclass Factory but through extending Holiday class
class LeavingTime extends Holiday{
    private double LeavingTime;

    public double getLeavingTime() {
        return LeavingTime;
    }

    public void setLeavingTime(double leavingTime) {
        LeavingTime = leavingTime;
    }
}
public class DoubleInheritance {

    public static void main(String[] args) {
        LeavingTime LT = new LeavingTime();
//        Holiday HD = new Holiday();
        LT.setEmployeeCount(2);
        LT.setLeavingTime(4.09);
        LT.setEmployeeName("Ram Bahadur");
        LT.setEmployeeWage(1200);
        System.out.println("Total Employees: "+ LT.getEmployeeCount());
        System.out.println("Employee Name: "+LT.getEmployeeName());
        System.out.println("Leaving Time from Task: "+ LT.getLeavingTime());
        System.out.println("Earning per day: "+ LT.getEmployeeWage());

    }
}
