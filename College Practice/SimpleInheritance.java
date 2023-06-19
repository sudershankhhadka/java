//this program signifies the simple  single level inheritance in java.


class Person{
    private String Name, Job;
    private int Salary;

    public void setName(String Name){
        this.Name = Name;
    }
    public void setJob(String Job){
        this.Job = Job;
    }
    public String getName(){
        return Name;
    }
    public String getJob(){
        return Job;
    }

}
 //Signifying Single Level inheritance
class GovernmentEmployee extends Person{
    int PublicFund;
    public void setPublicFund(int PublicFund){
        this.PublicFund = PublicFund;
    }
    public int getPublicFund(){
        return PublicFund;
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        GovernmentEmployee GE = new GovernmentEmployee();
        GE.setName("Sudershan Khadka");
        GE.setJob("Programmer");
        GE.setPublicFund(121200);
        System.out.println("Name: "+ GE.getName());
        System.out.println("Job: "+ GE.getJob());
        System.out.println("Public Fund Income"+ GE.getPublicFund());
    }

}
