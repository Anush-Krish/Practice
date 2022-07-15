package anush.Recursion;

import java.util.Scanner;
public class Recursion {
    public static void PrintNum(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        PrintNum(n-1);

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        PrintNum(n);
    }

}

