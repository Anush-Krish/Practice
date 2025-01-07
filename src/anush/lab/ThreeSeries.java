package anush.lab;

import java.util.Scanner;

public class ThreeSeries {
    public static void three(int a,int b,int n){
        if(n==0) {
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
//        int temp=b;
//        b=a+b;
//        a=temp;   if commented in, I passed a and b in recursion.
        three(b,c,n-1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        three(a,b,n-2);
    }
}
