package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human baby1 = new Human("Ребенок 1", true, 5, null);
        Human baby2 = new Human("Ребенок 2", true, 6, null);
        Human baby3 = new Human("Ребенок 3", true, 6, null);
        ArrayList<Human> baby = new ArrayList<>();
        baby.add(baby1);
        baby.add(baby2);
        baby.add(baby3);

        Human mother = new Human("Alexa", false, 25, baby);
        Human father = new Human("Alex", true, 30, baby);

        ArrayList<Human> parents1 = new ArrayList<>();
        parents1.add(father);

        ArrayList<Human> parents2 = new ArrayList<>();
        parents2.add(mother);

        Human grandFather1 = new Human("Max", true, 71, parents1);
        Human grandFather2 = new Human("Nik", true, 60, parents2);
        Human grandMother1 = new Human("Mini", false, 65, parents1);
        Human grandMother2 = new Human("Manya", false, 64, parents2);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(baby1);
        System.out.println(baby2);
        System.out.println(baby3);
    }

    public static class Human extends ArrayList<Human> {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.children == null)
                    return text;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
