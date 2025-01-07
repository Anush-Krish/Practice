package anush.lab;
import java.util.Scanner;

abstract class Studentz {
    int rollNo;
    long regNo;

    abstract void course();

    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextInt();
        System.out.print("Enter Registration No: ");
        regNo = scanner.nextLong();
    }
}

class KIITian extends Studentz {
    @Override
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class Lab5_1 {
    public static void main(String[] args) {
        KIITian kiitian = new KIITian();
        kiitian.getInput();
        System.out.println("Roll No - " + kiitian.rollNo);
        System.out.println("Registration No - " + kiitian.regNo);
        kiitian.course();
    }
}

