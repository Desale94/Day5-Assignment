package com.bridgelabz.demo;
import javax.swing.*;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1 > num2 && num1 > num3)
        {
            System.out.println(num1+ "is the largest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2+ "is the largest number");
        }
        else {
            System.out.println(num3+ "is the largest number");
        }
    }
}
