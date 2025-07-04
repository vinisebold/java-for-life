package java_basics.basic_exercises_part_I;

import java.util.Scanner;

/*
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

public class Exer007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int a = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(a + " x " + (i + 1) + " = " + (a * (i + 1)));
        }

        sc.close();
    }
}
