package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] num = new int[15];
        int k = 0;
        int l = 0;
        for (int i = 0; i < num.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            num[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0)
                k = k + num[i];
            else
                l = l + num[i];
        }


        if (k < l)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
