package com.bl.day_05;

import java.util.Scanner;

public class SumOf3 {
    public static int sumOfTriples(int a[], int length) {
        int i, j, k, count = 0;
        for (i = 0; i < length; i++ ) {
            for (j = i + 1; j < length; j++) {
                for (k = j + 1; k < length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n integer input array numbers: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + 1 + " Value:");
            arr[i] = sc.nextInt();
        }
        SumOf3 obj = new SumOf3();
        int sum = obj.sumOfTriples(arr, n);
        System.out.println("Number of distinct triplets " +sum);
    }
}
