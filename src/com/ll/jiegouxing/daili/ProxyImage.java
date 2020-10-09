package com.ll.jiegouxing.daili;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/9/14 0014 下午 16:37
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if(  null==realImage){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
