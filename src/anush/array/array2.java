package anush.array;

import java.util.Scanner;
public class array2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  of me.anush.Array:");
        int s=sc.nextInt();
        int ar[]=new int[s];
        for(int i=0;i<s;i++){
            System.out.println("Enter number:");
            ar[i]= sc.nextInt();
        }

        for(int i=0;i<s;i++){
            System.out.println("ARRAY"+ar[i]);
        }


    }



}
