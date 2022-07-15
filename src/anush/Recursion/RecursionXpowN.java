package anush.Recursion;

import java.util.Scanner;
public class RecursionXpowN {
    public static int Pow(int x,int n){
        if(n==0){

            return 1;
        }
        else if(x==0){
            return 0;
        }

        int xPownm1=Pow(x,n-1);
        int xPown= x* xPownm1;
        return xPown;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");

        int x=sc.nextInt();
        System.out.print("Enter Power:");
        int n= sc.nextInt();
        int k=Pow(x,n);
        System.out.println(k);
    }
}
