package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

import com.sun.corba.se.impl.orbutil.CacheTable;

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        if (o.getClass().getSimpleName().equals("Cat"))
            System.out.println("Кошка");
        if (o.getClass().getSimpleName().equals("Dog"))
            System.out.println("Собака");
        if (o.getClass().getSimpleName().equals("Bird"))
            System.out.println("Птица");
        if (o.getClass().getSimpleName().equals("Lamp"))
            System.out.println("Лампа");
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
