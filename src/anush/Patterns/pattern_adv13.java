package anush.Patterns;/*      1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
 */

import java.util.Scanner;
public class pattern_adv13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=r-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }




            System.out.println();
        }



    }




}
