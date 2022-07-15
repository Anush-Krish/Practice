package anush.Patterns;/*  inverted half pyramid
     (Rotated 180)
           * <----4space
          ** <----3space
         ***
        ****
       ***** <----0space
 */

import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number of rows:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int k=r-i;k>=0;k--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
                {
                    System.out.print("*");

                }
            System.out.println();
        }

    }
}
