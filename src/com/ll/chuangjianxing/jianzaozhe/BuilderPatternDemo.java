package com.ll.chuangjianxing.jianzaozhe;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/20 0020 上午 10:57
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder();
        Meal mealChicken=mealBuilder.prepareNonVegMeal();
        mealChicken.showItems();
        System.out.println("Total Cost: " +mealChicken.price());
        Meal mealVeg=mealBuilder.prepareVegMeal();
        mealVeg.showItems();
        System.out.println("Total Cost: " +mealVeg.price());
    }
}
