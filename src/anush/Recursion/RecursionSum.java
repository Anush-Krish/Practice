package anush.Recursion;

import java.util.Scanner;
public class RecursionSum {
    public static void SumNum(int n,int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        s=s+n;
        SumNum(n-1,s);

    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        SumNum(n,0);



    }
}
