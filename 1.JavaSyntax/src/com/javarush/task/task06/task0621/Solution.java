package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grantDad = reader.readLine();
        Cat catGrandDad = new Cat(grantDad);

        String grandMother = reader.readLine();
        Cat catGrandMother = new Cat(grandMother);

        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName, null, catGrandDad);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catDad);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catDad);

        System.out.println(catGrandDad);
        System.out.println(catGrandMother);
        System.out.println(catDad);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentDad;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMother, Cat parentDad) {
            this.name = name;
            this.parentMother = parentMother;
            this.parentDad = parentDad;
        }

        @Override
        public String toString() {
            if ((parentDad == null) && (parentMother == null))
                return "Cat name is " + name + ", no mother, no father ";
            else if (parentDad == null)
                return "Cat name is " + name + ", mother is " + parentMother.name + ", no father";
            else if (parentMother == null)
                return "Cat name is " + name + ", no mother, father is " + parentDad.name;
            else
                return "Cat name is " + name + ", mother is " + parentMother.name + ", father is " + parentDad.name;
        }
    }

}
