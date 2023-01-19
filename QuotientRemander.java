package com.bridgelabz.demo;
import java.util.Scanner;
public class QuotientRemander {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for division: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int quotient = 0, remainder = 0;
        quotient = num1 / num2;
        remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}


