package anush.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//try ind until correct index is entered.
public class Exception4 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 98;
        arr[1] = 56;
        arr[2] = 90;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.print("Enter index:");
            int idx = sc.nextInt();
            try {
                System.out.println("Welcome.");

                try {
                    System.out.println(arr[idx]);
                    flag=false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("idx out of bound:");
                }
            }
            catch(Exception e){
                System.out.println("Input mismatch.");

            }

        }
    }
}
