package com.codegym.main;

import com.codegym.object.Rectangle;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(15, 25);

        int area1 = rectangle1.getArea();
        int area2 = rectangle2.getArea();

        String name = Rectangle.getName();

        System.out.println(name);

        System.out.println("Area1: " + area1);
        System.out.println("Area2: " + area2);

    }
}
