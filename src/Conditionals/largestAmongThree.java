package Conditionals;

import java.util.Scanner;

public class largestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.printf("Enter second Number: ");
        b= sc.nextInt();
        System.out.printf("Enter third number: ");
        c = sc.nextInt();
        int max;
        if(a>b && a>c) max = a;
        else if(b>a && b>c) max  = b;
        else max = c;

        System.out.println("The largest among "+a+","+b+","+c+" is: "+max);
    }
}
