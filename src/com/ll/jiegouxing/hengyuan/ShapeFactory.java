package com.ll.jiegouxing.hengyuan;

import java.util.HashMap;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/9 0009 上午 11:36
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle=(Circle)circleMap.get(color);
        if(circle==null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
