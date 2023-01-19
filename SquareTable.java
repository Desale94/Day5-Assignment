package com.bridgelabz.demo;
import java.util.Scanner;

public class SquareTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num <= 0 || num < 31) {
            System.out.println("Table of power of 2");
            for (int j = 1; j <= num; j++) {
                System.out.println((int) Math.pow(2, j));
            }
        }
        else {
            System.out.println("Value is over than 31 try again!");
        }
        System.out.println(" ");
    }
}
