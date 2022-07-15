package anush.dsa.Basics;

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter elements:");
        int a=sc.nextInt();

        if(a%2==0){
            System.out.println("Even number.");
        }
        else{
            System.out.println("Odd number.");}
    }
}
