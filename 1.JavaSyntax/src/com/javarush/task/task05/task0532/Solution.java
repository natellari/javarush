package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int first = Integer.parseInt(reader.readLine());
        int maximum = first;

        for (int i = 0; i< count-1 ;i++) {
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader1.readLine());
            maximum = number > maximum ? number : maximum;
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
