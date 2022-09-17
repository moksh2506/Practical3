package com.company;
import java.util.Scanner;

interface IScanner{
    int sub();
    int sum();
}
interface IPrinter{
    void GetData();
}
public class pr3_2interface implements IScanner,IPrinter
{
    private int a,b;
    public void GetData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b= sc.nextInt();
    }
    public int sum() {
        return a+b;
    }
    public int sub() {
        return a-b;
    }
}