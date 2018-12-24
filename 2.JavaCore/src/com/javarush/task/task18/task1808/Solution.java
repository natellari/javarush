package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());

        int lengthSecond;

        while (inputStream.available() > 0) {
            if (inputStream.available() % 2 == 0) {
                lengthSecond = inputStream.available() / 2;
            } else
                lengthSecond = inputStream.available() / 2 + 1;

            byte[] bufferForSecondFile = new byte[lengthSecond];
            byte[] bufferForThreadFile = new byte[inputStream.available() / 2];

            outputStream.write(bufferForSecondFile, 0, inputStream.read(bufferForSecondFile));

            outputStream1.write(bufferForThreadFile, 0, inputStream.read(bufferForThreadFile));
        }
        reader.close();
        inputStream.close();
        outputStream.close();
        outputStream1.close();
    }
}
