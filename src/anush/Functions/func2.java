package anush.Functions;

import java.util.Scanner;
public class func2 {
    public static int Mul(int a,int b){

        return a*b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a= sc.nextInt();
        System.out.print("Enter another number:");
        int b= sc.nextInt();

        System.out.println("Product:"+Mul(a,b));
    }



}
