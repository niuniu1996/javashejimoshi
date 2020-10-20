package com.ll.chuangjianxing.jianzaozhe;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/20 0020 上午 10:38
 */
public abstract class ColdDrink implements Item{
    public Pack packing(){
       return new Bottle();
    }
    public abstract float price();
}
