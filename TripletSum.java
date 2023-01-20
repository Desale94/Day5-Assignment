package com.bridgelabz.demo;
import java.util.Scanner;
public class TripletSum {
    static Scanner s = new Scanner(System.in);
        static void findTriplets(int n)
        {
            int[] arr=new int[n];
            int count = 0;
            System.out.println("enter values");
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    for(int k=j+1;k<n;k++){
                        if(arr[i]+arr[j]+arr[k]==0){
                            count++;
                            System.out.println(arr[i]+ " "+ arr[j]+ " " +arr[k]);
                        }
                    }
                }
            }
            System.out.println("total pairs are " + count);
        }
    public static void main(String []args){
        System.out.println("Enter the number: ");
        int n =s.nextInt();
        findTriplets(n);
    }
    }

