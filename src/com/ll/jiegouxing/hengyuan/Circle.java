package com.ll.jiegouxing.hengyuan;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/9 0009 上午 11:28
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public Circle(String color){
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}');
    }
}
