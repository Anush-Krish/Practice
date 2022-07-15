package anush.Functions;

import java.util.Scanner;
public class func3 {
    public static int Factorial(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            k=k*i;

        }return k;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();
        System.out.print("Factorial:"+Factorial(n));
    }
}
