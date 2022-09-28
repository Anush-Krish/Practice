package anush.Exception;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[0]=45;
        arr[1]=94;
        arr[2]=6;
        System.out.print("Enter the index u wnt to divide:");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.print("Enter the value frm which u wnt to divide:");
        int b= sc.nextInt();
        try{
            System.out.println("Value of Index is:"+ arr[a]);
            System.out.println("Value:"+arr[a]/b);
        }
//        catch(Exception e){
//            System.out.println("Some exception occured.");
//            System.out.println(e);
//        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
        }
        catch(Exception e){
            System.out.println("Some exception occured.");
        }

    }
}
