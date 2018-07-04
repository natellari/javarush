package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
        //System.out.print("Прервано!");

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
                while (countSeconds > 0) {
                    System.out.print(countSeconds + " ");
                    Thread.sleep(1000);
                    countSeconds--;
                }

            } catch (InterruptedException e) {
                System.out.println("Прервано!");
                //e.printStackTrace();
                return;
            }
            System.out.println("Марш!");
        }
    }
}

