package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name, address, color;
    private int age, weight;

    public Cat(String name) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public Cat(int weight,  String color){
        this.age = age;
        this.color = color;
        this.weight = weight;

    }

    public Cat(int weight, String color, String address){
        this.address = address;
        this.age = age;
        this.color = color;
        this.weight = weight;

    }

    public static void main(String[] args) {

    }
}
