package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String,String>();
        map.put("Vova", "Kola");
        map.put("Vova1", "Kola1");
        map.put("Vova2", "Kola1");
        map.put("Vova3", "Kola1");
        map.put("Vova3", "Kola");

        map.put("Vova3", "Kola");
        map.put("Vova6", "Kola");
        map.put("Vova7", "Kola7");
        map.put("Vova8", "Kola8");
        map.put("Vova9", "Kola9");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
