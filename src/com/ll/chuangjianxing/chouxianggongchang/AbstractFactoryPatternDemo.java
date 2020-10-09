package com.ll.chuangjianxing.chouxianggongchang;

/**
 * @author liulan
 * @version 1.0
 * @date 2020/9/9 0009 下午 15:48
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory color = FactoryProducer.getFactory("color");
        color.getColor("red").fill();
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        shape.getShape("rectangle").draw();

    }
}
