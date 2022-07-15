package anush.Patterns;/*         1
          212
         32123
        4321234
       543212345
 */

import java.util.Scanner;
public class pattern_adv14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=r-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);

            }


            System.out.println();
        }


    }
}
