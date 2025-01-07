package anush.lab;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int odd=0;
        int even=0;
        int[] arr=new int[10];
        System.out.println("Enter element:");
        for(int i=0;i<=9;i++){
            arr[i]=sc.nextInt();
            if(i%2==0){
                even++;
            }
            else
                odd++;
        }
        System.out.println("Number of Even number:"+ even);
        System.out.println("Number of Odd number:"+odd);

    }
}
