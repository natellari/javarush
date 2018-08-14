package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadInf("Inf"));
        threads.add(new ThreadIE("IE"));
        threads.add(new ThreadHappy("Happy"));
        threads.add(new ThreadMessage("Message"));
        threads.add(new ThreadReader("Reader"));
    }

    public static void main(String[] args) {
        threads.get(0).start();

        threads.get(1).start();
    }

    public static class ThreadInf extends Thread {
        String name;

        public ThreadInf(String name) {
            this.name = name;
        }

        public void run() {
            while (true) {

            }
        }
    }

    public static class ThreadIE extends Thread {
        String name;

        public ThreadIE(String name) {
            this.name = name;
        }

        public void run() {
            try {
                Thread.sleep(1000000000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }

    }

    public static class ThreadHappy extends Thread {
        String name;

        public ThreadHappy(String name) {
            this.name = name;
        }

        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }

    public static class ThreadMessage extends Thread implements Message {
        String name;
        boolean n = true;

        public ThreadMessage(String name) {
            this.name = name;
        }

        public void run() {
            while (n) {

            }
        }

        @Override
        public void showWarning() {
            n = false;
        }
    }

    public static class ThreadReader extends Thread {
        String name;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean n = true;
        int summ = 0;
        String num;

        public ThreadReader(String name) {
            this.name = name;
        }

        public void run() {

            try {
                while (n) {
                    num = reader.readLine();
                    if (num.equals("N"))
                    {
                        System.out.println(summ);
                        n = false;
                    }
                    else {
                        summ = summ + Integer.parseInt(num);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}