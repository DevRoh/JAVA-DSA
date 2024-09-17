package Basics;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        System.out.println("ASCII value of "+ch+" is: "+(int)(ch));

    }
}
