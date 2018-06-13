package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandmother2 = new Human("Катя", false, 55);
        Human grandfather2 = new Human("Павел", true, 70);
        Human grandmother1 = new Human("Ola", false, 57);
        Human grandfather1 = new Human("Vova", true, 56);
        Human father = new Human("Михаил", true, 24, grandfather1, grandmother1);
        Human mother = new Human("Аня", false, 21, grandfather2, grandmother2);
        Human son1 = new Human("Игорь", true, 2, father, mother);
        Human son2 = new Human("Kir", true, 2, father, mother);
        Human dou = new Human("Ira", false, 3, father, mother);

        System.out.println(mother.toString());
        System.out.println(grandmother2.toString());
        System.out.println(son1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(father.toString());
        System.out.println(grandmother1.toString());
        System.out.println(son2.toString());
        System.out.println(grandfather1.toString());
        System.out.println(dou.toString());
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human mother;
        private Human father;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















