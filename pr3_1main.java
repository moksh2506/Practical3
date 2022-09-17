package com.company;
import java.util.Scanner;

public class pr3_1main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For circle");
        System.out.println("Enter the radius:");
        double r = sc.nextDouble();
        System.out.println("Enter the color:");
        String color=sc.next();
        System.out.println("Enter the filled in form of true and false:");
        boolean filled = sc.nextBoolean();
        System.out.println("For rectangle");
        System.out.println("Enter the height:");
        double h = sc.nextDouble();
        System.out.print("Enter Width : ");
        double w=sc.nextDouble();
        System.out.print("Enter The Colour : ");
        String color1 = sc.next();
        System.out.print("Enter The Filled in Form true and false : ");
        boolean filled1 = sc.nextBoolean();
        pr3_1_circle c =new pr3_1_circle(r,color,filled);
        pr3_1_rectangle R = new pr3_1_rectangle(h , w , color1 ,filled1);
        System.out.println("\nAnswer For Circle == ");
        System.out.printf("Using Get Area Method with Radius %.4f -- Area =", r);
        System.out.println(c.getArea());
        System.out.printf("Using Get Perimeter Method with Radius %.4f -- perimeter =",r);
        System.out.println(c.getPerimeter());
        System.out.println(c.toString());
        System.out.println("\nAnswer For Rectangle == ");
        System.out.printf("Using Get Area Method with Width %.4f , Height %.4f -- Area=", w,h );
        System.out.println(R.getArea());
        System.out.printf("Using Get Perimeter Method with Width %.4f , Height %.4f -- perimeter =", w,h);
        System.out.println(R.getPerimeter());
        System.out.println(R.toString());
        System.out.println("This program is prepared by 21CE099_Moksh.");
    }

}
