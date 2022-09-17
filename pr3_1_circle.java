package com.company;

public class pr3_1_circle extends pr3_1_geometricclass{
    static private double r;
    pr3_1_circle(){}
    pr3_1_circle(double r)
    {
        this.r=r;
    }
    pr3_1_circle(double r , String color , boolean filled)
    {
        super(color , filled);
        this.r=r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getD()
    {
        return r*2;
    }
    public static double getArea()
    {
        return 3.14*r*r;
    }
    public double getPerimeter()
    {
        return 2*3.14*r;
    }
}

