package anush.Patterns;/* solid rhombus
       *****
      *****
     *****
    *****
   *****
 */

import java.util.Scanner;
public class pattern_adv11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of rows:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=r-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++){
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
