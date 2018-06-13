package com.javarush.task.task14.task1408;

/**
 * Created by n.yarceva on 17.05.2018.
 */
public class UkrainianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 5;
    }


    @Override
    public String getDescription() {
        String ans = super.getDescription() + " Мoя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return ans;
    }
}
