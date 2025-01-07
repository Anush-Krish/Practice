package anush.lab;

import java.util.Scanner;
public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        String grade;
        if (marks >= 90) {
            grade = "O";
        } else if (marks >= 80) {
            grade = "E";
        } else if (marks >= 70) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println(marks+"="+ grade);
    }}
