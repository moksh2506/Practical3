package com.company;

public class pr3_3main {
    public static void main(String[] args) {
        pr3_3interface i = new pr3_3interface();
        System.out.println("a="+i.a);
        System.out.println("a1="+i.a1);
        System.out.println("a2="+i.a2);
        System.out.println("a3="+i.a3);
        i.get();
        System.out.println("Divide="+i.divide());
        System.out.println("Multiply="+i.multiply());
        System.out.println("Addition="+i.sum());
        System.out.println("Subtraction="+i.subt());
    }

}
