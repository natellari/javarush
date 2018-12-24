package com.javarush.task.task18.task1805;

/*
Сортировка байт
   123d
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Byte> b = new ArrayList<>();

        while (inputStream.available() > 0) {
            byte data = (byte) inputStream.read();

            if (!b.contains(data)) {
                b.add(data);
            }
        }
        inputStream.close();

        Collections.sort(b);

        for (Byte current : b) {
            System.out.print(current + " ");
        }

    }
}