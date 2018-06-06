package com.javarush.task.task07.task0702;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] line = new String[10];

        for (int i = 0; i < 8; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            line[i] = reader.readLine();
        }

        for (int i = line.length; i > 0; i--) {
            System.out.println(line[i-1]);
        }
    }
}