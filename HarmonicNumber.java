package com.bl.day_05;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("N should be a non-zero integer");
            return;
        }
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("The " + n + "th harmonic number is " + sum);

    }
}
