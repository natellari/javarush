package com.javarush.task.task18.task1802;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int min = inputStream.read();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data < min)
            {
                min = data;
            }
        }
        inputStream.close();
        System.out.println(min);
    }
}
