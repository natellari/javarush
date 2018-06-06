package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String address;
        private int age;
        private char sex;
        private int weight;
        private int height;

        public Human(){
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human (String name, String address, int age) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Human (String name, int weight, int height) {
            this.name = name;
            this.weight = weight;
            this.height = height;
        }

        public Human(String address, char sex) {
            this.address = address;
            this.name = "";
            this.sex = sex;
        }

        public Human(String name, int age, char sex)
        {
            this.address = "";
            this.name = name;
        }

        public Human(int weight, int height) {
            this.weight =weight;
            this.height = height;
        }

        public Human(char sex) {
            this.name = "Alex";
        }

        public Human (String name, String address, int age, char sex) {
            this.name = name;
            this.address = address;
            this.age = age;
            this.sex = sex;
        }
    }
}
