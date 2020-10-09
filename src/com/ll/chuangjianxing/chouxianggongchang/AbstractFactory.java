package com.ll.chuangjianxing.chouxianggongchang;

/**
 * @author liulan
 * @version 1.0
 * @date 2020/9/9 0009 下午 15:28
 * 为 Color 和 Shape 对象创建抽象类来获取工厂。
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);
}
