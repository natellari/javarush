package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import javax.sql.rowset.BaseRowSet;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        //args[1]
        FileInputStream inputStream = new FileInputStream(args[0]);

        int summ = 0;

        while (inputStream.available() > 0) {
            char data = (char) inputStream.read();
            if (((data >= 'a') && (data <= 'z')) || ((data >= 'A') && (data <= 'Z'))) {
                summ ++;
            }
        }

        System.out.println(summ);
        inputStream.close();

    }
}
