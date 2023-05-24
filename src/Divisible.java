//Program to display the numbers between 100 to 200 which are exactly divisible by 5
public class Divisible {
    public static void main(String[] args) {
        System.out.println("The numbers are");
        for(int i = 100;i<=200;i++){
            if(i%5==0){
                System.out.println(i);
            }
        }
    }
}
