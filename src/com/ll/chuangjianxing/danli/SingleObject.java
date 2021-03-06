package com.ll.chuangjianxing.danli;

/**
 * @author liulan
 * @version 1.0
 * @date 2020/9/9 0009 下午 16:36
 * SingleObject 类有它的私有构造函数和本身的一个静态实例
 */
public class SingleObject {
    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("单例模式");
    }

}
