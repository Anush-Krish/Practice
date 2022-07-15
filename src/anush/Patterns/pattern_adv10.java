package anush.Patterns;/* butterfly pattern
   *      *
   **    **
   ***  ***
   ********
   ********
   ***  ***
   **    **
   *      *
 */

import java.util.Scanner;
public class pattern_adv10 {
public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of rows:");
       int r=sc.nextInt();
       for(int i=1;i<=r;i++){
          for(int j=1;j<=i;j++){
             System.out.print("*");
          }
          for(int j=r-i;j>=1;j--)
          {
             System.out.print(" ");
          }
          for(int j=r-i;j>=1;j--)
          {
             System.out.print(" ");
          }
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }




          System.out.println();

       }
       for(int i=r;i>=1;i--){
          //reverse
          for(int j=i;j>=1;j--){
             System.out.print("*");
          }
          for(int j=1;j<=r-i;j++)
          {
             System.out.print(" ");
          }
          for(int j=1;j<=r-i;j++)
          {
             System.out.print(" ");
          }
          for(int j=i;j>=1;j--){
             System.out.print("*");

          }
          System.out.println();
       }






   }
}
