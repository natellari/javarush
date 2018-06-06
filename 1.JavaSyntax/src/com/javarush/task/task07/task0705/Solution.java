package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] num = new int[20];
        int[] min = new int[10];
        int[] max = new int[10];

        for (int i = 0; i < num.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            num[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            min[i] = num[i];
        }

        for (int i = 0; i < 10;i++) {
            max[i] = num[i+10];
            System.out.println(max[i]);
        }

    }
}
