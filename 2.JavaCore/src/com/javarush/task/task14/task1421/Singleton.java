package com.javarush.task.task14.task1421;

/**
 * Created by n.yarceva on 13.06.2018.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {
        this.instance = this;
    }

    public static Singleton getInstance() {
        //Singelton singelton = new Singelton();
        return instance;
    }

}
