package anush.dsaDPP;

import java.util.Scanner;

//if one element is zero make corresponding row and column zero.
public class Dpp3_2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter elements:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        int c=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==0 && c==0){
                   for(int k=0;k<3;k++){
                       arr[k][j]=0;
                   }
                    for(int k=0;k<3;k++){
                        arr[i][k]=0;
                    }
                   c++;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
