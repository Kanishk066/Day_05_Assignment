package com.bl.day_05;
public class PowerOf2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PowerOfTwo <power>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Power should be a non-negative integer");
            return;
        }
        for (int i = 0; i <= n; i++) {
            int powerOfTwo = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + powerOfTwo);
        }
    }
}
