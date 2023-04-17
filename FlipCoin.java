package com.bl.day_05;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to flip the coin: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Error!!!");
            return;
        }
        int headscount = 0;
        int tailscount = 0;
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5) {
                tailscount++;
            }
            else {
                headscount++;
            }
        }
        double HeadsPercentage = (100 * headscount) / (n);
        double TailsPercentage = (100 * tailscount) / (n);
        System.out.println("The Heads Percentage will be: " +HeadsPercentage);
        System.out.println("The Tails Percentage will be: " +TailsPercentage);
    }
}
