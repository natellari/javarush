package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        byte[] buff = new byte[inputStream.available()];
        inputStream.read(buff);
        inputStream.close();

        String str = new String(buff, Charset.forName("UTF-8"));
        String[] str2 = str.split("");

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < str2.length; i++) {
            if (!map.containsKey(str2[i])) {
                map.put(str2[i], 0);
            }
        }

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            for (int i = 0; i < str2.length; i++) {
                if (m.getKey().equals(str2[i])) {
                    m.setValue(m.getValue() + 1);
                }
            }
        }

        ArrayList<Map.Entry<String, Integer>> arrayList = new ArrayList<>();


        for (Map.Entry<String, Integer> m : map.entrySet())
        {
            arrayList.add(m);
        }

        arrayList.sort((o1, o2) -> {
            return Character.compare(o1.getKey().charAt(0), o2.getKey().charAt(0));
        });

        for (Map.Entry<String, Integer> l : arrayList) {
            System.out.println(l.getKey() + " " + l.getValue());
        }
    }
}
