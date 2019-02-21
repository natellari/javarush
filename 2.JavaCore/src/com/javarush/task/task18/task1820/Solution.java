package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        byte[] buff = new byte[inputStream.available()];
        inputStream.read(buff);

        String str = new String(buff, "UTF-8");

        String[] str2 = str.split(" ");
        Double[] dbl = new Double[str2.length];

        for (int i = 0; i < str2.length; i++) {
            dbl[i] = Double.parseDouble(str2[i]);
        }

        /*String join = String.join(" ",
                Arrays.stream(str2)
                        .map(s -> Long.toString(Math.round(Double.parseDouble(s))))
                        .collect(Collectors.toList()));
        outputStream.write(join.getBytes());*/

        String string = round(dbl);
        outputStream.write(string.getBytes());

        inputStream.close();
        outputStream.close();
    }

    private static String round(Double[] buff) {
        String out_str = "";
        for (int i = 0; i < buff.length; i++) {
            out_str = out_str.concat(String.valueOf(Math.round(buff[i]))).concat(" ");
        }

        return out_str.trim();
    }
}
