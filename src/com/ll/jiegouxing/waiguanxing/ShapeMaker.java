package com.ll.jiegouxing.waiguanxing;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/9 0009 上午 10:53
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

}
