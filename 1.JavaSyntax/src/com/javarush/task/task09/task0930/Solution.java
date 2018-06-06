package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        boolean[] place = new boolean[array.length];
        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> num = new ArrayList<>();
        int i = 0;

        for (int o = 0; o < array.length; o++) {
            if (isNumber(array[o])) {
                num.add(array[o]);
                place[o] = true;
            } else {
                str.add(array[o]);
                place[o] = false;
            }
        }

        String[] arrStr = str.toArray(new String[str.size()]);
        String[] arrNum = num.toArray(new String[num.size()]);
        Integer[] arrInt = new Integer[arrNum.length];
        for (String a : arrNum) {
            arrInt[i] = Integer.parseInt(a);
            i++;
        }

        for (int k = arrStr.length - 1; k > 0; k--) {
            for (int j = 0; j < k; j++) {
                if (isGreaterThan(arrStr[j], arrStr[j+1])) {
                    String tmp = arrStr[j];
                    arrStr[j] = arrStr[j + 1];
                    arrStr[j + 1] = tmp;
                }
            }
        }

        Arrays.sort(arrInt, Collections.reverseOrder());

        int l = 0;
        int m = 0;
        for (boolean b : place) {

            if (b == false) {
                System.out.println(arrStr[l]);
                l++;
            } else {
                System.out.println(arrInt[m]);
                m++;
            }
        }


    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
