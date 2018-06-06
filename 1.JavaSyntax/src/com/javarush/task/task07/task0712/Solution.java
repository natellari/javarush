package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int min = 99999999;
        int num_max = -1;
        int num_min = -1;

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                num_min = i;
            }
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                num_max = i;
            }
        }

        //for (int i = 0; i < 10; i++) {
        if (num_min > num_max)
            System.out.println(list.get(num_max));
        else
            System.out.println(list.get(num_min));
        //}
    }

}

