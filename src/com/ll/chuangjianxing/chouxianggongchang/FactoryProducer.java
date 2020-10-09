package com.ll.chuangjianxing.chouxianggongchang;

/**
 * @author liulan
 * @version 1.0
 * @date 2020/9/9 0009 下午 15:44
 * 工厂生成器
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
