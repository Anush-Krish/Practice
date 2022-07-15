package anush.Patterns;/*  half pyramid
    *
    **
    ***
    ****
    *****
 */

import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number of rows:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){

            for(int j=1;j<=i;j++){

                    System.out.print("*");


            }
            System.out.println();
        }

    }
}
