package com.codegym.object;

public class Rectangle {

    private static String name = "Rectangle";
    protected int with;
    protected int heigh;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Rectangle() {
    }

    public Rectangle(int with, int heigh) {
        this.with = with;
        this.heigh = heigh;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public int getArea() {
        return this.with * this.heigh;
    }

    public static String getName() {
        return name;
    }

    public int getSum(int a, int b) {
        return a + b;
    }

    public int getSum(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
