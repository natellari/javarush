package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach beach = new Beach("OLO", 12, 4);
        Beach beach1 = new Beach("Olo2", 13, 4);
        //beach.compareTo(beach1);
        System.out.println(beach.compareTo(beach1));
    }

    //@Override
    public synchronized int compareTo(Beach obj) {

        int i = 0;

        if ((this.getDistance() == obj.getDistance()) && (this.getQuality() == obj.getQuality()))
        {
            return 0;
        }

        if (this.getDistance() == obj.getDistance()) {
            if (this.getQuality() > obj.getQuality()) {
                return 1;
            }
            else {
                return -1;
            }
        }

        if (this.getDistance() > obj.getDistance()) {
            if (this.getQuality() <= obj.getQuality()) {
                return -1;
            }
            else
            {
                return 1;
            }
        }

        if (this.getDistance() < obj.getDistance()) {
            if (this.getQuality() >= obj.getQuality())
            {
                return  1;
            }
            else
            {
                return  -1;
            }
        }

        return i;
    }
}
