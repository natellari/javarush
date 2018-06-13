package com.javarush.task.task09.task0921;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList= new ArrayList<Integer>();

        try {
            while (true) {
                arrayList.add(Integer.parseInt(reader.readLine()));
            }
        }
         catch (NumberFormatException e) {

            for (Integer list : arrayList) {
                System.out.println(list);
            }
            //e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
        }

    }
}
