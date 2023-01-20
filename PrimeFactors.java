package com.bridgelabz.demo;

public class PrimeFactors {
    public static void main(String[] args) {
        int i;
        int n = Integer.parseInt(args[0]);
        for (i=2; i<n; i++){
            while(n%i == 0) {
                System.out.println(i+" ");
                n = n/i;
            }
        }
        if(n>2){
            System.out.print(n);
        }
    }
}
