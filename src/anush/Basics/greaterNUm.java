package anush.Basics;

import java.util.Scanner;
public class greaterNUm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 elements:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b){
            System.out.print(a);
            System.out.println("is greater.");
        }
        else if (b>a){
            System.out.print(b);
            System.out.println(" is greater.");
        }
        else {System.out.println("Both are equal.");}





    }

}
