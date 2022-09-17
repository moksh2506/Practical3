package com.company;

import java.util.Scanner;
public class pr3_4main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int p= sc.nextInt();
        System.out.println("Enter the second value:");
        int q=sc.nextInt();
        pr3_4class a=new pr3_4class();
        a.sample1(p,q);
        pr3_4class.child c = new pr3_4class.child();
        c.sample1(p,q);
    }
}
