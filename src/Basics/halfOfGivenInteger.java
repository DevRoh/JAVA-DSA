package Basics;

import java.util.Scanner;

public class halfOfGivenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your integer: ");
        int a = sc.nextInt();
        System.out.println("The half of your given integer is: "+(double)(a/2));
    }
}
