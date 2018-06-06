package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        //HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

        //ArrayList<Integer> co = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = 0;
        int count = 1;
        int max = 1;

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i) == list.get(i + 1)) {
                //value = list.get(i);
                count++;
                if (max < count)
                    max = count;
            } else {
                count = 1;
            }
/*            if ((i + 1 == list.size()) && (list.get(i + 1) == list.get(list.size() - 1))) {
                count.put(k, c++);
            }*/
        }

        System.out.println(max);
       /* for (
                Map.Entry<Integer, Integer> test : count.entrySet())

        {
            int p = test.getValue();
            if (p > test.getValue() + 1)
            System.out.println(test.getValue());
        }
*/
    }
}