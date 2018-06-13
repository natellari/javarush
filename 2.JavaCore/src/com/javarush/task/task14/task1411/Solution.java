package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //ArrayList<String> arrayList = new ArrayList();
        Person person = null;
        String key = null;


        //тут цикл по чтению ключей, пункт 1
        while (true) {
            key = reader.readLine();
            if (key.equals("user")) {
                person = new Person.User();
                //user.live();
                doWork(person);
                continue;
            }
            if (key.equals("loser")) {
                person = new Person.Loser();
                doWork(person);
                continue;
            }
            if (key.equals("coder")) {
                person = new Person.Coder();
                doWork(person);
                continue;
            }
            if (key.equals("proger")) {
                person = new Person.Proger();
                doWork(person);
                continue;
            }
            break;
        }

        //создаем объект, пункт 2

        //doWork(person); //вызываем doWork


    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }

        if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }

        if (person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
        }

        if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }

    }

}