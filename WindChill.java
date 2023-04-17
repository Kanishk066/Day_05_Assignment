package com.bl.day_05;
import java.util.Scanner;
public class WindChill {
    public void WindChillFunction(double t,double v){
        if (Math.abs(t) > 50 || v > 120 || v < 3) {
            System.out.println("Invalid input");
            return;
        }
        // Calculate wind chill
        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Wind chill: " + windChill);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of t: ");
        double t = sc.nextDouble();
        System.out.println("Enter the value of v: ");
        double v = sc.nextDouble();
        WindChill obj = new WindChill();
        obj.WindChillFunction(t,v);
    }
}

