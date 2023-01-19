package com.bridgelabz.demo;
import java.util.Scanner;

public class SquareTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num <= 0 || num < 31) {
            System.out.println("Table of power of 2");
            for (int i = 1; i <= num; i++) {
                System.out.println((int) Math.pow(2, i));
            }
        }
        else {
            System.out.println("Value is over than 31 try again!");
        }
        System.out.println(" ");
    }
}
