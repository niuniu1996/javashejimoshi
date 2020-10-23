package com.ll.jiegouxing.qiaojie;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/23 0023 下午 17:34
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: 红色, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
