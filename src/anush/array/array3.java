package anush.array;

import java.util.Scanner;
public class array3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter  of array:");
        int s=sc.nextInt();
        int ar[]=new int[s];
        for(int i=0;i<s;i++){
            System.out.print("Enter element:");

            ar[i]= sc.nextInt();
        }
        System.out.print("Enter An Element to choose from me.anush.Array:");
        int ch=sc.nextInt();
        for(int i=0;i<ar.length;i++){
            if (ar[i]==ch){
                System.out.print("Elemment found in index "+i);
            }

            }

        }



    }

