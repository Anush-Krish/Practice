package anush.Functions;

import java.util.Scanner;
public class func1 {
    public static int Sum2(int a,int b){
        int i=a+b;
        return i;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Element:");
        int c= sc.nextInt();
        System.out.print("Enter another Element:");
        int d= sc.nextInt();
        int i=Sum2(c,d);
        {
            System.out.println(i);
        }

    }

}
