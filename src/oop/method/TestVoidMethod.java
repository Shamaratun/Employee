package oop.method;

import java.util.Scanner;

public class TestVoidMethod {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("The grade for obtained marks is: ");
        // Read the marks from the user
        double score = marks.nextDouble();

        // Call the GradePoint method and pass the score to it
        GradePoint(score);
    }

    public static void GradePoint(double score) {
        if (score > 100.0) {
            System.out.println("invalid score is entered");
        }
        if (score >= 90.0) {
            System.out.println("A++");
        }
        else if (score >= 80.0) {
            System.out.println("A+");
        }
        else if  (score >= 70.0) {
            System.out.println("A");
        }
        else if  (score >= 60.0) {
            System.out.println("A-");
        }
        else if  (score >= 50.0) {
            System.out.println("B");
        }
        else if  (score >= 40.0) {
            System.out.println("D");
        } else {
            System.out.println("f");
        }
    }
}