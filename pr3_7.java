package com.company;

import java.sql.SQLOutput;
interface address{
    public void Details();
    default void Address(){
        System.out.println("Address:-\n Nadiad, 387002");
    }
}
public class pr3_7 implements address
{
    @Override
    public void Details() {
        System.out.println("Details:-");
        System.out.println("Name:Moksh Patel");
        System.out.println("ID NO.: 21CE099");
        System.out.println("College: CSPIT");
        System.out.println("Branch: Computer Engineering");
        System.out.println("sem: 3");
    }
    public static void main(String[] args) {
        pr3_7 p =new pr3_7();
        p.Details();
        p.Address();
    }
}