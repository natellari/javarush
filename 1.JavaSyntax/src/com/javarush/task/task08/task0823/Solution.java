package com.javarush.task.task08.task0823;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sold = reader.readLine();
        String snew = "";
        String substr = "";
        int len = sold.length();
        int index = 0;
        substr = sold.substring(0,1);
        substr = substr.toUpperCase();
        snew = snew.concat(substr);
        for (int i = 0; i < len;) {
        if (sold.indexOf(' ') != -1){

            index = sold.indexOf(' ');
            snew = snew.concat(sold.substring(1, index + 1));
            substr = sold.substring(index + 1 , index + 2);
            substr = substr.toUpperCase();
            snew = snew.concat(substr);
            sold = sold.substring(sold.indexOf(' ') + 1, sold.length());
            i = sold.indexOf(' ') + 2;
        }

        else
        {
            snew = snew.concat(sold.substring(1, sold.length()));
            i = len +1;
        }
        }
        System.out.println(snew);

    }
}
