package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            num[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = num.length; i > 0; i--) {
            System.out.println(num[i-1]);
        }
    }
}

