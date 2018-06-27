package com.javarush.task.task15.task1530;

/**
 * Created by n.yarceva on 27.06.2018.
 */
public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
