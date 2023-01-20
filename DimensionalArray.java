package com.bridgelabz.demo;
import java.util.Scanner;
public class DimensionalArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and column of the array: ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.print("Enter the elements of m rows and n column of the array: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Aarray: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}