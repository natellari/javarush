package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile));
        String exit = "exit";
        String data =  "";

        while (!data.equals(exit))
        {
            data = reader.readLine();
            writer.write(data + '\n');
        }

        writer.close();
        reader.close();
    }
}
