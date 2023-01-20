package com.bridgelabz.demo;
public class SquareTable {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
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
