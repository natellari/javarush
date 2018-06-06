package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int id = 0;
        String name = null;
        String line = null;

        while ((line = reader.readLine()) != null ){
            //String k = reader.readLine();
            if (line.trim().equals(""))
                break;
            else {
                id = Integer.parseInt(line);
                name = reader.readLine();
                map.put(name, id);
            }

        } //while (reader.readLine() != null);

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getValue() + " " + m.getKey());
        }
    }
}
