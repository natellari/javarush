package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String exit = "exit";

        while (true) {
            String k = reader.readLine();
            if (k.equals(exit)) {
                break;
            }

            try {
                if (k.contains(".")) {
                    double k0 = Double.parseDouble(k);
                    print(k0);
                } else {
                    int k0 = Integer.parseInt(k);
                    if ((k0 > 0) && (k0 < 128)) {
                        short k1 = Short.parseShort(String.valueOf((short) k0));
                        print(k1);
                    } else {
                        print(k0);
                    }
                }
            } catch (Exception e) {
                print(k);
            }
        }

    }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
