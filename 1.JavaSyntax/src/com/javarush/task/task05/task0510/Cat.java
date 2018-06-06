package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void init(String name) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void init(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void init(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void init(int weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void init(int weight, String color, String address) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
