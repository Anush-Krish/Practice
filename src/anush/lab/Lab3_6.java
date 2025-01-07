package anush.lab;

import java.util.*;

class Rectangle1 {
    int length;
    int breadth;

    Rectangle1() {
        length = 0;
        breadth = 0;
    }

    Rectangle1(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println(
                "Area of rectangle with length " + length + " and breadth " + breadth + " is: " + (length * breadth));
    }
}

class Lab3_6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Rectangle1 r1 = new Rectangle1();
        r1.area();
        System.out.println("Enter length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle1 r2 = new Rectangle1(l, b);
        r2.area();
    }
}
