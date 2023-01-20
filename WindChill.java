package com.bridgelabz.demo;
import java.util.Scanner;
public class WindChill {
    static void windChill(double t, double v) {

        double w = 35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println(w);
    }

    public static void main(String[] args) {

        double t=Double.parseDouble(args[0]);
        double v=Double.parseDouble(args[0]);
        if (Math.abs(t) > 50 || v > 120 || v < 3) {
            System.out.println("enter correct input"); //assume the correct range.
        } else {
            System.out.println("input not in range"); //if not in range then back to function.
        }
    }
}

