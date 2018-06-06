package com.javarush.task.task07.task0718;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        boolean kit = true;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i).length() >= list.get(i + 1).length()) && kit == true) {
                System.out.println(i+1);
                kit = false;
            }
        }
    }
}

