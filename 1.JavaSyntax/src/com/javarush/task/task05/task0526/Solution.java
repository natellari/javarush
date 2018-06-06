package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man("Pavel", 18, "A");
        Man man1 = new Man("Igor", 19, "B");

        Woman woman = new Woman("Masha", 19, "C");
        Woman woman1 = new Woman("Kat", 20, "O");

        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);

        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
    }

    //напишите тут ваш код
    public static class Man {
        String name, address;
        int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }

    public static class Woman {
        String name, address;
        int age;

        public Woman(String name, int age, String address){
            this.address = address;
            this.age = age;
            this.name = name;
        }
    }
}
