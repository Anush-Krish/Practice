package anush.lab;

import java.util.*;

class box {
    double l, w, h;

    void volume() {
        double vol;
        vol = l * w * h;
        System.out.println("Volume of box is: " + vol);
    }
}

class Lab3_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        box b = new box();
        System.out.println("Enter length width and height of box: ");
        b.l = sc.nextDouble();
        b.w = sc.nextDouble();
        b.h = sc.nextDouble();
        b.volume();
    }
}
