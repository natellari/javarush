package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        double sum = 0;
        double count = 0;
        do {
            num = Integer.parseInt(reader.readLine());
            if (num != -1) {
                sum = sum + num;
                count++;
            }

        } while (num != -1);
        System.out.println(sum/count);
    }
}

