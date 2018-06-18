package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(short m, short n, String value) {
        System.out.println("Заполняем объектами Short");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(Integer m, double n, Object value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(short m, Integer n, String value) {
        System.out.println("Заполняем объектами Integer2");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, double n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, (double) n, (Object) value);
    }
    public static void printMatrix(int m, String n, String value) {
        System.out.println("Заполняем объектами String1");
        printMatrix(m, n, (String) value);

    }
    public static void printMatrix(String m, int n, String value) {
        System.out.println("Заполняем объектами String3");
        printMatrix(m, n, (String) value);
    }

    public static void printMatrix(int m, float n, String value) {
        System.out.println("Заполняем объектами Float2");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(float m, float n, String value) {
        System.out.println("Заполняем объектами Float");
        printMatrix((int) m, n, (Object) value);
    }
}
