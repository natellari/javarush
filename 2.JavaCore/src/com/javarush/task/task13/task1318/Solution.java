package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameFile = reader.readLine();

        InputStream inputStream = new FileInputStream(nameFile);
       // OutputStream outputStream = new FileOutputStream()
        int i = -1;
        while ((i =  inputStream.read()) != -1){
            //int data = inputStream.read();
            System.out.print((char)i);
        }

        inputStream.close();
        reader.close();


    }
}