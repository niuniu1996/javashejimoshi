package com.ll.jiegouxing.qiaojie;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/23 0023 下午 17:37
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
