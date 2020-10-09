package com.ll.chuangjianxing.gongchang;

/**
 * @author liulan
 * @version 1.0
 * @date 2020/9/9 0009 下午 15:10
 */
public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
    }
}
