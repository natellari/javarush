package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String > addr = new HashMap<String, String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            String city = reader.readLine();
            if (city.isEmpty()) break;
            addr.put(city, family);
        }

        String cityGo = reader.readLine();

        for (Map.Entry<String, String> a : addr.entrySet()) {
            String value = a.getValue();
            //System.out.println(value);
            if (value.equals(cityGo)) {
                System.out.println(a.getKey());
            }
        }
        //list of addresses
        /*List<String> addresses = new ArrayList<String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }*/

        //read home number
        /*int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }*/
    }
}
