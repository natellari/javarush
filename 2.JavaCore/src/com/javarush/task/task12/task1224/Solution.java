package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        if (o.getClass().getSimpleName().equals("Cat"))
            return "Кот";
        if (o.getClass().getSimpleName().equals("Tiger"))
            return "Тигр";
        if (o.getClass().getSimpleName().equals("Lion"))
            return "Лев";
        if (o.getClass().getSimpleName().equals("Bull"))
            return "Бык";

        return "Животное";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
