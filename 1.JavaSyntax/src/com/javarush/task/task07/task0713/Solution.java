package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> all = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            all.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < all.size(); i++) {
            if (all.get(i) % 3 == 0)
                list1.add(all.get(i));
            if (all.get(i) % 2 == 0)
                list2.add(all.get(i));
            if ((all.get(i) % 3 != 0) && (all.get(i) % 2 != 0))
                list3.add(all.get(i));
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
