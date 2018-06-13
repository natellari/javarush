package com.javarush.task.task14.task1408;

/**
 * Created by n.yarceva on 17.05.2018.
 */
public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    public String getDescription() {
        String ans = super.getDescription() + " Мoя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return ans;
    }
}
