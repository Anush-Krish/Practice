package anush.Exception;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        //return super.toString()+"I am to string.";
        return "I am to string";
    }
    @Override
    public String getMessage() {
//        return super.getMessage() + "I am get message.";
        return "I am get message.";
    }
}
public class Exception5 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num:");
        int a=sc.nextInt();
        if(a<9){
            try {
                  //throw new MyException();
                  throw new ArithmeticException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }

    }
}
