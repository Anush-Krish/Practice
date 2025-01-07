package anush.lab;

import java.util.Scanner;

public class RecursionFibonacci {
    public static void Fibonac(int a,int b,int n){
        if(n==0) {
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
//        int temp=b;
//        b=a+b;
//        a=temp;   if commented in, I passed a and b in recursion.
        Fibonac(b,c,n-1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        Fibonac(a,b,n-2);
    }
}
