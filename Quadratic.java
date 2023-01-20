package com.bridgelabz.demo;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int a=sc.nextInt();
        System.out.println("Enter second value: ");
        int b=sc.nextInt();
        System.out.println("Enter third value: ");
        int c=sc.nextInt();
        Calculation(a,b,c);
    }
    static void Calculation(int a,int b,int c){
        int delta = b*b - 4*a*c;
        int x1 = (int) ((-b + sqrt(delta))/(2*a));
        int x2 = (int) ((-b - sqrt(delta))/(2*a));
        System.out.println("Root of x1: "+x1);
        System.out.println("Root of x2: "+x2);

    }
}
