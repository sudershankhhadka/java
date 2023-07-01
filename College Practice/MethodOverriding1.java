//Program to demonstrate the use of super keyword in method overrriding




import java.util.Scanner;
class Earning{
    private int InADay;
    private int InAMonth;

    public Earning(int day,int month)
    {
        day = InADay;
        month = InAMonth;
    }
    Scanner input = new Scanner(System.in);
    public void totalEarning(){
        System.out.println("Enter the earning in a day: ");
        int daywage = input.nextInt();
        System.out.println("Enter the earning in a Month:");
        int inAmonth = input.nextInt();

    }


    class Overrride extends Earning{
        public  Overrride(){
            super(InADay,InAMonth);
        }
        public void AccessingSuper(){
            super.totalEarning();
            System.out.println("This is the Method overriding using super ");
        }
    }
public class MethodOverriding1 {
    public void main(String[] args) {
        Overrride or = new Overrride();
        or.AccessingSuper();
    }
    }
}
