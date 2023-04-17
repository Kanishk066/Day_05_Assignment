package com.bl.day_05;
import java.util.Scanner;
public class Array2D{
    public void PrintArrayElements(int[][] arr,int a,int b) {
        System.out.println("The Array 2D is: ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner array = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = array.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = array.nextInt();
        int[][] Arr = new int[rows][cols];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                Arr[i][j] = array.nextInt();
            }
        }
        Array2D obj = new Array2D();
        obj.PrintArrayElements(Arr, rows, cols);
    }
}
