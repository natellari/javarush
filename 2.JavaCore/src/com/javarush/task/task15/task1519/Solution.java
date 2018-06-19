package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов

Not work
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String exit = "exit";
        double k0 = 0;
        int k1 = 0;

        do {
            String k = reader.readLine();
            if (k.equals(exit)) {
                break;
            }

            if (k.contains(".")) {

                k0 = Double.parseDouble(k);
                print(k0);
            }
        else{
            try {
                k1 = Integer.parseInt(k);
                if ((k1 > 0) && (k1 < 128)) {
                    short k2 = Short.parseShort(String.valueOf((short) k1));
                    print(k2);
                } else {
                    print(k1);
                }
            } catch (Exception e) {
                print(k);
            }

        }

    } while(true);
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
