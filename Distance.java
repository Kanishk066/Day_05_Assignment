package com.bl.day_05;
import java.util.Scanner;
public class Distance {
    public void distanceFunction(double a,double b) {
        double dis = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The distance will be: "+ dis);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
       Distance obj = new Distance();
       obj.distanceFunction(x,y);
    }
}
