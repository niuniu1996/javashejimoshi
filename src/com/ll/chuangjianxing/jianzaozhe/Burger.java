package com.ll.chuangjianxing.jianzaozhe;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/20 0020 上午 10:35
 */
public abstract class Burger implements Item{

    public Pack packing() {
        return new Wrapper();
    }

    public abstract float price();
}
