package com.company;
import java.util.Scanner;

public class pr3_4package {

        Scanner sc = new Scanner(System.in);
    private int a;
    private int b;
    public void getdata()
    {
        System.out.println("Enter the first value:");
        a=sc.nextInt();
        System.out.println("Enter the value of second value:");
        b=sc.nextInt();
    }
    public int add()
    {
        return a+b;
    }
    public static void sub(int a,int b){
        int ans=a+b;
        System.out.println("Subtraction of a & b is "+ans);
    }
}
