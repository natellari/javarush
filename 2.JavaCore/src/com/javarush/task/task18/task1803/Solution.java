package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        HashMap<Byte, Integer> bb = new HashMap<>();
        HashMap<Byte, Integer> b = new HashMap<>();
        int max = 0;
        byte key = 0;


        while (inputStream.available() > 0) {
            byte data = (byte) inputStream.read();

            if (!bb.containsKey(data)) {
                bb.put(data, 1);
            } else {
                Integer integer = bb.get(data);
                bb.put(data, integer + 1);
            }
        }
        inputStream.close();

        for (Map.Entry<Byte, Integer> entry : bb.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }

        b.put(key, max);

        for (Map.Entry<Byte, Integer> entry : bb.entrySet()) {
            if (entry.getValue() == max) {
                b.put(entry.getKey(), entry.getValue());
            }
        }

        for (Map.Entry<Byte, Integer> entry : b.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
    }
}