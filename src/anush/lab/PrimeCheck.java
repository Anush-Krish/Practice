package anush.lab;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int c=0;

    for(int i=2;i<n;i++){
        if(n%i==0){
            c++;
        }
    }
    if(c==0){
        System.out.println("prime number");
    }
    else
        System.out.println("Not a prime");

}}
