package anush.lab;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         char s=sc.next().charAt(0);
         switch(s){
             case 'a':
                 System.out.println("Vowel");
                 break;
             case 'e':
                 System.out.println("Vowel");
                 break;
             case 'i':
                 System.out.println("Vowel");
                 break;
             case 'o':
                 System.out.println("Vowel");
                 break;
             case 'u':
                 System.out.println("Vowel");
                 break;
             default:
                 System.out.println("Not a vowel");
         }


    }
}
