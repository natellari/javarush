package com.javarush.task.task10.task1012;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < abcArray.length; i++) {
            map.put(abcArray[i], 0);
        }

        String[] strArray = new String[list.size()];
        strArray = list.toArray(strArray);


        for (String l : strArray)
        {
            //System.out.println(l);
            char[] c = l.toCharArray();
            for (int i = 0; i < c.length; i++) {
                for (Map.Entry<Character, Integer> m : map.entrySet()) {
                    if ((c[i] == m.getKey())) {
                        map.put(m.getKey(), m.getValue() + 1);
                    }
                }
            }
        }

        for (int i = 0; i < abcArray.length; i++) {

            for (Map.Entry<Character, Integer> m : map.entrySet()) {
                if (abcArray[i] == m.getKey())
                    System.out.println(m.getKey() + " " + m.getValue());
            }
        }


    }

}
