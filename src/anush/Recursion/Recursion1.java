package anush.Recursion;

import java.util.Scanner;
public class Recursion1 {


    public static void PrintNum(int n,int c){


        if( n==0){

            return;
        }

        System.out.println(c);
        PrintNum(n-1,c+1);
    }
    public static void main(String[] args){
        int c=1;
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        PrintNum(n,c);
    }
}
