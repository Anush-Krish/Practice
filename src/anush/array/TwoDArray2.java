package anush.array;

import java.util.Scanner;
public class TwoDArray2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows:");
        int r= sc.nextInt();
        System.out.print("Enter number of Columns:");
        int c=sc.nextInt();
        int ar[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                System.out.print("Enter element:");
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("ENTER ELEMENT TO FIND FROM ARRAY:");
        int ch= sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(ar[i][j]==ch){
                    System.out.print("Index of array: "+i+" "+j);
                }

            }
        }





    }
}
