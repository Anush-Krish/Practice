package anush.Loops;

import java.util.Scanner;
public class N_Sum_LOop {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter A number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;


        }
        System.out.print("Sum of N natural number:");
        System.out.println(sum);





    }
}
