package anush.Patterns;/*  Floyd's Triangle
    1
    2 3
    4 5 6
    7 8 9 10

 */

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number of rows:");
        int r=sc.nextInt();
        int c=1;
        for(int i=1;i<=r;i++){

            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }

            System.out.println();
        }

    }
}
