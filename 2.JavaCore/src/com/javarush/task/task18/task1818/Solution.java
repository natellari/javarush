package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        FileInputStream fileInputStream = new FileInputStream(file2);
        FileInputStream fileInputStream1 = new FileInputStream(file3);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        while (fileInputStream1.available() > 0) {
            byte[] buf = new byte[fileInputStream1.available()];
            fileInputStream1.read(buf);
            fileOutputStream.write(buf);
        }
        reader.close();

        fileOutputStream.close();
        fileInputStream.close();
        fileInputStream1.close();
    }
}
