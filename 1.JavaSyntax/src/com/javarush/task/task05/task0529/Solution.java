package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String summa = "сумма";
        int sum = 0;
        String num = "";
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            num = reader.readLine();
            if (num.equals(summa)) {
                System.out.println(sum);
            } else {
                int numm = Integer.parseInt(num);
                sum = sum + numm;
            }
        } while (!num.equals(summa));

    }
}