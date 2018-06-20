package com.javarush.task.task15.task1522;

/**
 * Created by n.yarceva on 20.06.2018.
 */
public class Earth implements Planet {
    private static Earth instance;
    private Earth() {};

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }

}
