package anush.Patterns;/* hollow rectangle
   *****
   *   *
   *   *
   *****
 */


import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Columns:");
        int c= sc.nextInt();
        System.out.print("Enter Number of rows:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){

            for(int j=1;j<=c;j++){
                if(i==1||j==1||i==r||j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
