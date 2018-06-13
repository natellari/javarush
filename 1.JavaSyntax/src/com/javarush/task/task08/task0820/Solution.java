package com.javarush.task.task08.task0820;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        //напишите тут ваш код
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
        //rrayList<Object> myPets = new ArrayList<Object>();
        //ArrayList<Object> myCats = new ArrayList<Object>();



        //Object[] myPets = new Object[pets.size()];
        //Object[] myCats = new Object[cats.size()];
        //String[] myArray = {};
        /*System.out.println(pets.toArray());
        for (int i =0; i < myPets.length; i++)
        {
            for (int j =0; j < myCats.length; j++)
            {
                if (myPets[i].equals(myCats[j]))
                    myPets[i].
            }
        }
*/
        //myArray = pets.toArray();
        //String[] catsArray = {};
        //catsArray = cats.toArray(new String[cats.size()]);
        //System.out.println(cats instanceof pets);

    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object o: pets) {
            System.out.println(o);
        }
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}
