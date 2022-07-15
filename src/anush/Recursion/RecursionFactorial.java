package anush.Recursion;

import java.util.Scanner;

public class RecursionFactorial {
    public static void Fact(int n,int f){
        if(n==0){
            System.out.println(f);
            return;
        }
        f=f*n;
        Fact(n-1,f);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();
        Fact(n,1);
    }

}
