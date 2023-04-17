package com.bl.day_05;
import java.util.Scanner;
public class Quadratic {
    public void QuadraticFunction(double x, double y, double z) {
        double delta = (y*y) - (4* x * z);
        System.out.println("The value of delta: "+delta);
        double root1, root2;
        if (delta>0) {
            root1 = (-y + Math.sqrt(delta))/(2*x);
            root2 = (-y - Math.sqrt(delta))/(2*x);
            System.out.println("Root 1 of x = " +root1);
            System.out.println("Root 2 of x = " +root2);
        } else if (delta == 0) {
            root1 = root2 = (-y) / (2*x);
            System.out.println("Root 1 of x is = Root 2 of x=" +root1);
        }
        else {
            System.out.println("Equation has no real roots");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Quadratic obj = new Quadratic();
        obj.QuadraticFunction(a,b,c);
    }
}
