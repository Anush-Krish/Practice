package anush.array;

import java.util.Scanner;
public class TwoDArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows for me.anush.Array:");
        int r= sc.nextInt();
        System.out.print("Enter number of Columns for me.anush.Array:");
        int c=sc.nextInt();
        int ar[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter number:");
                ar[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ar[i][j]+"   ");

            }
            System.out.println();
        }


    }
}
