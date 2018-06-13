package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        Map<String, Integer> calendar = new HashMap<String, Integer>();
        calendar.put("January", 1);
        calendar.put("February", 2);
        calendar.put("March", 3);
        calendar.put("April", 4);
        calendar.put("May", 5);
        calendar.put("June", 6);
        calendar.put("July", 7);
        calendar.put("August", 8);
        calendar.put("September", 9);
        calendar.put("October", 10);
        calendar.put("November", 11);
        calendar.put("December", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        for (Map.Entry<String, Integer> pair : calendar.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();

            if (key.equals(month))
                System.out.println(month +" is " + value +" month");
        }

    }
}
