package com.ll.chuangjianxing.jianzaozhe;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/20 0020 上午 10:56
 */
public class MealBuilder  {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegtableBuger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
