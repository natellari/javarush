package com.javarush.task.task14.task1409;

/* 
Мосты
*/

import static jdk.nashorn.internal.objects.Global.println;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
    //add println method here

/*    interface Bridge {

    }*/

/*    static class WaterBridge implements Bridge{

        @Override
        public int getCarsCount() {
            return 5;
        }
    }*/

/*    static class SuspensionBridge implements Bridge{

        @Override
        public int getCarsCount() {
            return 10;
        }
    }*/
}

