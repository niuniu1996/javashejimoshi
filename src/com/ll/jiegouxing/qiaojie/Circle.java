package com.ll.jiegouxing.qiaojie;


/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/23 0023 下午 17:42
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
