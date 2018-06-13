package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("Ola1", "Ola");
        map.put("Ola2", "Ola");
        map.put("Ola3", "Ola");
        map.put("Ola4", "Ola");
        map.put("Ola5", "Ola");

        map.put("Ola6", "Ola");
        map.put("Ola7", "Ola");
        map.put("Ola8", "Ola");
        map.put("Ola9", "Ola");
        map.put("Ola0", "Ola1");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>(map.values());

        int count;
        for (String s: list) {
            count = 0;
            for (String str2: list)
            {
                if (s.equals(str2))
                    count++;
                if (count == 2) removeItemFromMapByValue(map,s);
            }
        }

        /*String name;
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String,String> pair = it.next();
            name = pair.getValue();
            removeItemFromMapByValue(map, name);
        }*/
        /*
        for (HashMap.Entry<String, String> maps : map.entrySet()) {
            name = maps.getValue();
            removeItemFromMapByValue(map, maps.getValue());
        }*/
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        //removeTheFirstNameDuplicates(createMap());
    }
}
