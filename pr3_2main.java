package com.company;
import java.util.Vector;

public class pr3_2main {
    public static void main(String[] args) {
        Vector<pr3_2interface> v = new Vector<pr3_2interface>(2);
        for (int i = 0; i < 2; i++) {
            pr3_2interface p1 = new pr3_2interface();
            v.add(p1);
        }
        for (int i = 0; i < 2; i++)
        {
            System.out.println(" answer for Index = "+ i+1);
            v.get(i).GetData();
            System.out.println("Addition = " + v.get(i).sum());
            System.out.println("Subtraction = " + v.get(i).sub());
        }
    }
}
