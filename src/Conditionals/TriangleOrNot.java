package Conditionals;

import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter first side: ");
        a = sc.nextInt();
        System.out.printf("Enter second Side: ");
        b= sc.nextInt();
        System.out.printf("Enter third side: ");
        c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b)
            System.out.println("These sides are of Triangle..");
        else
            System.out.println("Not triangle..");
    }
}
