package com.javarush.task.task04.task0421;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by n.yarceva on 26.01.2018.
 */
public class SolutionTest {/*
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }*/

    @org.junit.Test
        public void Test1(){
            Solution solution = new Solution();
            String name1 = "Маша";
            String name2 = "Маша";
            //
            //String expected =
            assertEquals(Solution.compare(name1, name2), "Имена идентичны");
        }

    @org.junit.Test
    public void Test2(){
        Solution solution = new Solution();
        String name1 = "Маша";
        String name2 = "Yаша";
        //
        //String expected =
        assertEquals(Solution.compare(name1, name2), "Длины имен равны");
    }


}