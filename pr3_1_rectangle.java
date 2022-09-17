package com.company;

public class pr3_1_rectangle extends pr3_1_geometricclass{
    static double h;
    static double w;
    pr3_1_rectangle() {}
    pr3_1_rectangle(double h , double w) {
        this.h = h;
        this.w = w;
    }
    pr3_1_rectangle(double h , double w , String color , boolean filled )
    {
        super(color , filled);
        this.h=h;
        this.w=w;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    public double getW() {
        return w;
    }
    public void setW(double w) {
        this.w = w;
    }
    public static double getArea()
    {
        return w*h;
    }
    public  double getPerimeter()
    {
        return 2*(w+h);
    }
}

