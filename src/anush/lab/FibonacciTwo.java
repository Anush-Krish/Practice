package anush.lab;

import java.util.Scanner;

public class FibonacciTwo {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int f=0,s=1;
        System.out.print(" " + " " +s);
        for(int i=2; i<n; i=i+2){
            f=f+s;
            s=f+s;
            System.out.print(" " +f +" "+ s);
        }

    }

}
