//Addtion without the command line
//Taking input from the Scanner class i.e from the user

import java.util.*;
public class Addition {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum: "+c);
    }

}
