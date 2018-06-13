package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            //напишите тут ваш код
            double ned = 18.5;
            double norm = 25.0;
            double izb = 30.0;

            double imt = weight / (height*height);
            //double imt = 30;

            if (imt < ned) {
                System.out.println("Недовес: меньше чем 18.5"); }
            else if ((imt >= ned) && (imt < norm)) {
                System.out.println("Нормальный: между 18.5 и 24.9");}
            else if ((imt >= norm) && (imt < izb)) {
                System.out.println("Избыточный вес: между 25 и 29.9"); }
            else if (imt >= izb)
            { System.out.println("Ожирение: 30 или больше");}
        }
    }
}
