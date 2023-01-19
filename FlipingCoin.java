package com.bridgelabz.demo;
import java.util.Scanner;

public class FlipingCoin {

    public static void main(String[] args){
        int n, head = 0, tail = 0;
        double heads, tails;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of times you want to flip the coin: ");
        n=sc.nextInt();

        for (int i = 0; i < n; i++) {
            double random = Math.random();
            if (random < 0.5)
                tail++;
            else
                head++;
        }

        heads = head / (double) n * 100;
        tails = tail / (double) n * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");

    }

}
