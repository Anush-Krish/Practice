package anush.lab;

import java.util.Scanner;

public class Lab2_6 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a[][]= new int [3][3];

            System.out.println("enter elements of matrix");

            for(int i=0;i<3;i++) {
                for(int j=0;j<3;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }

            int left_diag = a[0][0] + a[1][1] + a[2][2];
            System.out.println("sum of left diag is "+left_diag);
            int right_diag=a[0][2] + a[1][1] + a[2][0];
            System.out.println("sum of right diag is "+right_diag);


        }

    }

