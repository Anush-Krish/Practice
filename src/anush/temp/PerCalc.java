package anush.temp;

import java.util.Scanner;

public class PerCalc {
    public static void main(String[] args) {
        System.out.println("Enter Number of subjects:");
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        String[] arr=new String[n];
        int sum=0;

        for(int i=0;i<n;i++){
            System.out.println("Enter sub name:");
            String sub=sc.next();
            arr[i]=sub;
            System.out.println("Enter  marks of that sub:");
            int s=sc.nextInt();
            sum+=s;
        }

        int per=(sum*100)/(n*100);
        System.out.println("Percentage="+per);


    }
}
