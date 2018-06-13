package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        //System.out.println(hen.getDescription());

        /*Hen hen2 = HenFactory.getHen(Country.RUSSIA);
        hen2.getCountOfEggsPerMonth();
        System.out.println(hen2.getDescription());

        Hen hen3 = HenFactory.getHen(Country.UKRAINE);
        hen3.getCountOfEggsPerMonth();
        System.out.println(hen3.getDescription());

        Hen hen4 = HenFactory.getHen(Country.MOLDOVA);
        hen4.getCountOfEggsPerMonth();
        System.out.println(hen4.getDescription());*/
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country.equals(Country.BELARUS)) {
                hen = new BelarusianHen();
            }
            if (country.equals(Country.RUSSIA)) {
                hen = new RussianHen();
            }
            if (country.equals(Country.MOLDOVA))
                hen = new MoldovanHen();
            if (country.equals(Country.UKRAINE))
                hen = new UkrainianHen();
            return hen;
        }
    }

/*    public static abstract class Hen {
        abstract int getCountOfEggsPerMonth();

        String getDescription() {
            return "Я - курица.";
        }
    }*/


}
