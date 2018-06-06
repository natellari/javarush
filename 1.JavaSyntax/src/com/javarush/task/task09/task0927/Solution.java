package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String,Cat> map = new HashMap<String,Cat>();
        map.put("Vasa", new Cat("Vasa"));
        map.put("Vasa1", new Cat("Vasa1"));
        map.put("Vasa2", new Cat("Vasa2"));
        map.put("Vasa3", new Cat("Vasa3"));
        map.put("Vasa4", new Cat("Vasa4"));

        map.put("Vasa5", new Cat("Vasa5"));
        map.put("Vasa6", new Cat("Vasa6"));
        map.put("Vasa7", new Cat("Vasa7"));
        map.put("Vasa8", new Cat("Vasa8"));
        map.put("Vasa9", new Cat("Vasa9"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<Cat>();
        for (Map.Entry<String, Cat> maps : map.entrySet()) {
            cats.add(maps.getValue());
            //System.out.println(maps.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
