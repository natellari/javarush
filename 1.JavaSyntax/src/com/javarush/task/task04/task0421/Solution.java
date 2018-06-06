package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       //напишите тут ваш код
/*        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();*/
        String name1 = "";
        String name2 = "";

    }
    public static String compare(String name1, String name2) {
        if (name1.equals(name2))
            return "Имена идентичны";
        else if (name1.length() == name2.length())
            return "Длины имен равны";
        return null;
    }
}
