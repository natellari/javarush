package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        ArrayList<Integer> list = new ArrayList<>();


        FileInputStream inputStream = new FileInputStream(fileName);
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; inputStream.available() > 0; i++) {
            list.add(i, readInt(inputStream));
        }

        Collections.sort(list);

        for (Integer l : list)

        {
            if (l % 2 == 0)
                System.out.println(l);
        }
        scanner.close();
        reader.close();
        inputStream.close();
    }

    public static int readInt(FileInputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        return scanner.nextInt();
    }
}
