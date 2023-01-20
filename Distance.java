package com.bridgelabz.demo;

public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y= Integer.parseInt(args[1]);
        power(x,y);

    }
    static void power(int x,int y){
        System.out.println("distance: "+ Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));

    }
}