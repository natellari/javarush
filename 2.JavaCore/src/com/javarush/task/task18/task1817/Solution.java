package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[0]);
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        double summ_empty = 0.0;
        double summ_full = 0.0;

        while (inputStream.available() > 0) {
            char data = (char) inputStream.read();

            if (data == ' ') {
                summ_empty++;
            }
            summ_full++;

        }

        double d = (summ_empty / summ_full) * 100.0;
        System.out.println(decimalFormat.format(d));

        inputStream.close();
    }
}
