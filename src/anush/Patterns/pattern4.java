package anush.Patterns;/*inverted half loop
     *****
     ****
     ***
     **
     *


 */

import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of rows:");
        int r = sc.nextInt();
        for (int i = r; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}

