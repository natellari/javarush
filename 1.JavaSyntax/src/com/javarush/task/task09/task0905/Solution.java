package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        int deep = 0;
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        for (StackTraceElement element : stackTraceElement)
            deep++;
        System.out.println(deep);
        return deep;
    }
}

