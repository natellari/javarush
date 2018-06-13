package com.javarush.task.task14.task1419;

import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;

/*
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            ArrayList<String> list = new ArrayList<>();
            list.add(-1,"S");

        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ExportException("C:/");
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] array = new int[-3];
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            FileInputStream fis = null;
            fis = new FileInputStream("C:/");
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new RuntimeException();
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String x = "a";
            if (x.equals("a"))
                throw  new IOException();
            else
                throw  new FileNotFoundException();
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String x = "a";
            if (x.equals("b"))
                throw new IOException();
            else
                throw new UnsupportedOperationException();
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            {
                throw new NullPointerException("demo");
            }
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            {
                throw  new RemoteException();
            }
        }catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код

    }
}
