package com.javarush.task.task18.task1814;

import com.javarush.task.task16.task1631.common.BmpReader;

import java.io.*;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String filename = reader.readLine();

    public TxtInputStream(String fileName) throws IOException {
        super(fileName);
    }

    public static void main(String[] args) {
    }
}

