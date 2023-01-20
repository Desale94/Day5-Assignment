package com.bridgelabz.demo;
import java.util.*;
class SwappNumber{
    public static void main(String[] args) {
        int x, y,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for swapping: ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("before swapping numbers: "+x +"  "+ y);
        t = x;
        x = y;
        y = t;
        System.out.println("After swapping: "+x +"   " + y);
    }
}  