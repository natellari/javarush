package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        paramsPars(args);
    }


    public static void paramsPars(String[] args) {
        switch (args[0]) {
            case ("-c"):
                createPeople(args);
                break;
            case ("-u"):
                updatePeople(args);
                break;
            case ("-d"):
                deletePeople(args);
                break;
            case ("-i"):
                infoPeople(args);
                break;
            default:
                System.out.println("fail");
        }
    }

    public static void createPeople(String[] args) {
        if (args.length == 4) {
            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], dateFormat(args[3])));
            } else if (args[2].equals("ж")) {
                allPeople.add(Person.createFemale(args[1], dateFormat(args[3])));
            }
            System.out.println(allPeople.size() - 1);
        } else {
            System.out.println("no create");
        }
    }

    public static void updatePeople(String[] args) {
        if (args.length == 5) {
            if (args[3].equals("м")) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            } else if (args[3].equals("ж")) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
            } else {
                System.out.println("wrong sex");
            }
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(dateFormat(args[4]));
        } else {
            System.out.println("no update");
        }
    }

    public static void deletePeople(String[] args) {
        if (args.length == 2) {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
        } else {
            System.out.println("no delete");
        }
    }

    public static void infoPeople(String[] args) {
        if (args.length == 2) {
            String male;
            Date bd = allPeople.get(Integer.parseInt(args[1])).getBirthDay();
            if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)) {
                male = "м";
            } else {
                male = "ж";
            }
            System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() + " " + male + " " + dateFormat(bd));
        } else {
            System.out.println("no info");
        }
    }

    public static String dateFormat(Date date) {
        String strDateFormat = "dd-MMM-yyyy";
        SimpleDateFormat date1 = new SimpleDateFormat(strDateFormat, Locale.ENGLISH);
        return date1.format(date);
    }

    private static Date dateFormat(String date) {
        SimpleDateFormat dateSimple = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
        Date doc = null;
        try {
            doc = dateSimple.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return doc;
    }
}
