package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        StringJoiner joiner = new StringJoiner(" ");
        String[] parameters;
        Map<String, String> map = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String self = reader.readLine();

        parameters = self.substring(self.indexOf("?") + 1).split("&");
        for (int i = 0; i < parameters.length; i++) {
            String s = parameters[i];
            joiner.add(s.contains("=") ? s.substring(0, s.indexOf("=")) : s);
            map.put(s.contains("=") ? s.substring(0, s.indexOf("=")) : s, s.contains("=") ? s.substring((s.indexOf("=") + 1), s.length()) : s);
        }

        System.out.println(joiner);

        for (Map.Entry<String, String> m : map.entrySet()) {
            if (m.getKey().equals("obj")) {
                try {
                    Double value = Double.parseDouble(m.getValue());
                    alert(value);
                }
                catch (Exception e)
                {
                    alert(m.getValue());
                }

            }
        }


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
