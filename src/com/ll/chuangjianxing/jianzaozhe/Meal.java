package com.ll.chuangjianxing.jianzaozhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/20 0020 上午 10:50
 */
public class Meal {
    public List<Item> list = new ArrayList<Item>();

    public void addItem(Item item) {
        list.add(item);
    }

    public float price() {
        float price = 0f;
        for (Item item : list) {
            price += item.price();
        }
        return price;
    }

    public void showItems() {
        for (Item item : list) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
