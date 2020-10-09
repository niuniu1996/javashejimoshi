package com.ll.chuangjianxing.chouxianggongchang;

/**
 * @author liulan
 * @version 1.0
 * @date 2020/9/9 0009 下午 15:34
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    public Color getColor(String colorType){
        if(colorType == null){
            return null;
        }
        if(colorType.equalsIgnoreCase("green")){
            return new Green();
        } else if(colorType.equalsIgnoreCase("red")){
            return new Red();
        } else if(colorType.equalsIgnoreCase("black")){
            return new Black();
        }
        return null;
    }
}
