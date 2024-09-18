package Conditionals;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        if(n<0)
        {
            n = (-1)*n;
        }
        System.out.println("The absolute value of n is: "+n);
    }
}
