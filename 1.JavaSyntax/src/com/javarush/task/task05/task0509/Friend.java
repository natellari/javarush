package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    //напишите тут ваш код
    private String name;
    private int age;
    private char gender;

    public void init(String name) {
        this.name = name;
    }

    public void init(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void init(String name, int age, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public static void main(String[] args) {

    }
}
