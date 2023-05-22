//Menu driven program to add,subtract,divide and multiply
import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
        System.out.println("Enter the type of operation");
        int option = sc.nextInt();
        System.out.println("Enter the values of first and second number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(option){
            case 1:
                int add= a+b;
                System.out.println(add);
                break;
            case 2:
                int sub = a-b;
                System.out.println(sub);
                break;
            case 3:
                int mul = a*b;
                System.out.println(mul);
                break;
            case 4:
                int div = a/b;
                System.out.println(div);
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
