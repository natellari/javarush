package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(5,5.0));
        System.out.println(convertEurToUsd(2,3.0));

        //напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur*course;
    }
}
