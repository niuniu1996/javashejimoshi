package com.ll.jiegouxing.waiguanxing;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/9 0009 上午 10:56
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
