package com.ll.chuangjianxing.yuanxing;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/20 0020 下午 15:01
 */
public class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("画一个长方形");
    }
    public Rectangle(){
        type = "Rectangle";
    }
}
