package Basics;
import java.util.Scanner;
public class sumOfTwoUsingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is: "+sum);

    }
}
