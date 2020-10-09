package com.ll.jiegouxing.daili;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/9/14 0014 下午 16:41
 */
public class ProxyImageDemo {

    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("代理测试");
        // 图像将从磁盘加载
        System.out.println("图像需要从磁盘加载");
        proxyImage.display();
        System.out.println("");
        System.out.println("图像不需要从磁盘加载");
        // 图像不需要从磁盘加载
        proxyImage.display();
    }

}
