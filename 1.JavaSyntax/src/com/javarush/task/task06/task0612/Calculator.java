package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int summ = a + b;
        return summ;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int minus = a - b;
        return minus;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int multiply = a * b;
        return multiply;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double div1 = (double) a / (double) b;
        return div1;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double percent = ((double) a / 100) * (double) b;
        return percent;
    }

    public static void main(String[] args) {
        //System.out.println(percent(5,2));
        //System.out.println(division(5,2));
    }
}