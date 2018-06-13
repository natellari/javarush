package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        ArrayList<Character> listVowel = new ArrayList<Character>();
        ArrayList<Character> listNoVowel = new ArrayList<Character>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        //String line = "Мама мыла раму.";
        char[] chars = line.toCharArray();
        //System.out.println(chars.length);

        for (int i = 0; i < line.length(); i++) {

            if (isVowel(chars[i])) {
                listVowel.add(chars[i]);
            } else
            if (chars[i] != ' '){
                listNoVowel.add(chars[i]);
            }

        }
        for (Character ch : listVowel) {
            System.out.print(ch + " ");

        }
        System.out.println();
        for (Character ch : listNoVowel) {
            System.out.print(ch + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}