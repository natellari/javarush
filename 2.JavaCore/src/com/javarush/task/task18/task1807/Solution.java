package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int count_2 = 0;

        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);

            for (Byte b:buffer)
            {
                if (b == ',')
                {
                    count_2++;
                }
            }
        }
        System.out.println(count_2);

        inputStream.close();
    }
}
