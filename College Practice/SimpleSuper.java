//program to demonstrate usecase of super keyword in java


class PrecastConcretes{
    private String EmployeeName;
    private int Wage;

    PrecastConcretes(String EmployeeName,int Wage){
        this.EmployeeName = EmployeeName;
        this.Wage = Wage;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }
    public int getWage(){
        return Wage;
    }

}
class DailyWagePerPerson extends PrecastConcretes{
    DailyWagePerPerson(String EmployeeName ,int Wage){
        super(EmployeeName,Wage);
    }
}
public class SimpleSuper {
    public static void main(String[] args) {
    DailyWagePerPerson dailywage = new DailyWagePerPerson("Pramod",1200);
        System.out.println("Name: "+ dailywage.getEmployeeName());
        System.out.println("Wage: "+ dailywage.getWage());
    }
}
