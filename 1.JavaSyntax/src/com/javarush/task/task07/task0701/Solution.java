package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] i = new int[20];
        for (int k = 0; k < i.length; k++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            i[k] = Integer.parseInt(reader.readLine());
        }
        return i;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        Arrays.sort(array);
        int len = array.length;
        return array[len-1];
    }
}
