package com.company;
import java.util.Date;

abstract class pr3_1_geometricclass {
    String colour ;
    Date dateCreated = new Date();
    boolean filled ;
    pr3_1_geometricclass(){}
    pr3_1_geometricclass(String a , boolean f)
    {
        colour = a;
        filled = f;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "color = "+ colour + "\nCreated Date = "+dateCreated+ "\nFilled = " +filled ;
    }

    static double getArea() {
        return 0;
    }

    abstract double getPerimeter();

}
