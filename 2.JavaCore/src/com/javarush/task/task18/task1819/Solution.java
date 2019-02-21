package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(file1);
        byte[] buffer = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer);
        fileInputStream1.close();


        FileInputStream fileInputStream2 = new FileInputStream(file2);
        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);
        fileInputStream2.close();


        FileOutputStream out = new FileOutputStream(file1);
        out.write(buffer2);
/*        System.out.println(buffer2.length);
        System.out.println(buffer.length);*/
        out.write(buffer);
        out.flush();
        out.close();
    }
}
