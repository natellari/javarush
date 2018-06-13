package com.javarush.task.task14.task1408;

import static com.javarush.task.task14.task1408.Solution.*;

/**
 * Created by n.yarceva on 17.05.2018.
 */
public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }
    @Override
    public String getDescription(){
        String aws = super.getDescription() + " Мoя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return aws;
    }
}
