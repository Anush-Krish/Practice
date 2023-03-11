package anush.dsaDPP;

import java.util.Scanner;

//traversal of diagonal.
public class Dpp_2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter Elements:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
