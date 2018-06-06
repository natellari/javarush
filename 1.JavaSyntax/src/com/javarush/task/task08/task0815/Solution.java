package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("ola", "vova");
        hash.put("ola1", "vova");
        hash.put("ola2", "vova");
        hash.put("ola3", "vova");
        hash.put("ola4", "vova");

        hash.put("ola5", "vova");
        hash.put("ola6", "vova");
        hash.put("ola7", "vova");
        hash.put("ola8", "vova");
        hash.put("ola9", "vova");

        return hash;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        //System.out.println(map.values());
        int count = 0;

        for (Map.Entry<String,String> maps : map.entrySet())
            if (name.equals(maps.getValue()))
                count ++;
        /*for (int i=0; i < map.size(); i ++)
        {

        }*/

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;

        for (Map.Entry<String,String > maps : map.entrySet()) {
            if (lastName.equals(maps.getKey()))
                count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        //getCountTheSameFirstName(createMap(), "Ola");
    }
}
