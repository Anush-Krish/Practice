package anush.lab;

import java.util.*;
public class Perfect {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n-1;
        int i=0, val=0;
        for(i=1;i<=m;i++){
            if(n%i==0){
                val=val+i;
            }
        }
        if(val==n){
            System.out.println("perfect");
        }
        else{
            System.out.println("not perfect");
        }
    }
}
