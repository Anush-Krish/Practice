package anush.BitMan;//Updatebit

import java.util.Scanner;
public class Bits4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5; //0101
        System.out.print("Enter Position For operation:");
        int pos=sc.nextInt();
        System.out.print("ENTER OPERATION 1 or 0:");
        int op=sc.nextInt();
        if(op==1){
            //OR
            int BitMask=1<<pos;
            int NewNUmber=BitMask | n;
            System.out.println(NewNUmber);
        }
        else{
            //NOT AND
            int BitMask=1<<pos;
            int NotBitMask=~(BitMask);
            int NewNumber=NotBitMask & n;
            System.out.println(NewNumber);
        }
    }
}
