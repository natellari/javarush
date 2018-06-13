package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name ;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
        this.age = 10;
        this.name = "Барсик";
        this.weight = 3;
        this.strength = 4;

        Cat cat2 = new Cat();
        cat2.strength = 3;
        cat2.weight = 2;
        cat2.name = "olo";
        cat2.age = 3;

        int fight = this.fight(cat2);
        System.out.print(fight);
    }

    public int fight(Cat anotherCat) {
        //напишите тут ваш код
        if (this.weight > anotherCat.weight)
            return 3;
        else
            return 4;

    }

    public static void main(String[] args) {

    }
}
