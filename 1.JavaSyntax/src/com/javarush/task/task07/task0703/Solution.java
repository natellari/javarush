package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] line = new String[10];
        int[] count = new int[10];

        for(int i = 0; i < line.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            line[i] = reader.readLine();
            count[i] = line[i].length();
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}
