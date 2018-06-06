package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            num[i] = Integer.parseInt(reader.readLine());
        }
        for (int k = num.length - 1; k > 0; k--) {
            for (int l = 0; l < k; l++) {
                if (num[l] > num[l + 1]) {
                    int tmp = num[l];
                    num[l] = num[l + 1];
                    num[l + 1] = tmp;
                }
            }
        }
        //напишите тут ваш код


        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
