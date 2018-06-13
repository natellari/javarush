package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String end = "end";
        int i = -1;

        do {
            list.add(reader.readLine());
            i++;
        } while (!list.get(i).equals(end));

        list.remove(i);

        for (String s : list)
            System.out.println(s);
        //напишите тут ваш код
    }
}