package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(bufferedReader.readLine());
        FileOutputStream outputStream = new FileOutputStream(bufferedReader.readLine());

        while (inputStream.available() > 0) {
            byte[] buff = new byte[inputStream.available()];
            inputStream.read(buff);

            sort(buff);

            outputStream.write(buff);
        }

        inputStream.close();
        outputStream.close();
    }

    public static void sort(byte[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            byte tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
    }
}
