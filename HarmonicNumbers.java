package com.bridgelabz.demo;
import java.util.Scanner;


class HarmonicNumbers{

    public static void main(String args[])
    {

        int num = Integer.parseInt(args[0]);
        double result = 0.0;
        System.out.println("The harmonic series is: ");

        for (int i = num; i > 0; i--) {
            result = result + (double)1 / i;
            System.out.print(result + ", ");
        }
    }
}