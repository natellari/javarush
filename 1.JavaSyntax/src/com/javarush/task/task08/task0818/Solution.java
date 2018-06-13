package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        hash.put("Juk2", 10);
        hash.put("Juk1", 10);
        hash.put("Juk3", 10);
        hash.put("Juk4", 10);
        hash.put("Juk5", 10);

        hash.put("Juk6", 100);
        hash.put("Juk7", 100);
        hash.put("Juk8", 1000);
        hash.put("Juk9", 1000);
        hash.put("Juk0", 100000);

        return hash;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String,Integer> pair = it.next();
            if (pair.getValue() < 500) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {
    }
}