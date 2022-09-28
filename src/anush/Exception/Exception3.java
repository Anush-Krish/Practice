package anush.Exception;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[0]=89;
        arr[1]=23;
        arr[2]=78;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index");
        int a=sc.nextInt();
        try{
            System.out.println("Welcome");
            try{
                System.out.println(arr[a]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index out of Bound.");
                System.out.println("Exception in level2");
            }

        }
        catch(Exception e){
            System.out.println("Exception level 1");
        }
    }
}
