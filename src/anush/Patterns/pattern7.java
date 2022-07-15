package anush.Patterns;/*  inverted half pyramid with number.
    12345
    1234
    123
    12
    1

 */

import java.util.Scanner;
public class pattern7 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number of rows:");
        int r=sc.nextInt();
        for(int i=r;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
