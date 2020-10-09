package com.ll.jiegouxing.daili;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/9/14 0014 下午 16:34
 */
public class RealImage implements Image {
    private String fileName;

    @Override
    public void display() {
        System.out.println("表现 filename is " + fileName);
    }
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    private void loadFromDisk(String fileName){
        System.out.println("加载 " + fileName);
    }
}
