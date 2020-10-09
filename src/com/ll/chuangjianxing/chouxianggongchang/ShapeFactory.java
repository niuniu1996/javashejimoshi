package com.ll.chuangjianxing.chouxianggongchang;



/**
 * @author liulan
 * @version 1.0
 * @date 2020/9/9 0009 下午 15:05
 */
public class ShapeFactory extends AbstractFactory {

    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }


    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
