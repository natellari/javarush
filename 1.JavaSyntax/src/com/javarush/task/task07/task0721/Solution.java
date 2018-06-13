package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = -999999999;
        int minimum = 999999999;
        int[] num = new int[20];
        for (int i =0; i < 5; i++)
            num[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < num.length; i++) {
            if (num[i] < minimum)
                minimum = num[i];
            if (num[i] > maximum)
                maximum = num[i];
        }
        //напишите тут ваш код

        System.out.println(maximum + " " + minimum);
    }
}
