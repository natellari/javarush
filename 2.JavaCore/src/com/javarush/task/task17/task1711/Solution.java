package com.javarush.task.task17.task1711;

import com.javarush.task.task17.task1710.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {

        switch (args[0]) {
            case ("-c"):
                synchronized (allPeople) {
                    createPeople(args);
                    break;
                }
            case ("-u"):
                synchronized (allPeople) {
                    updatePeople(args);
                    break;
                }
            case ("-d"):
                synchronized (allPeople) {
                    deletePeople(args);
                    break;
                }
            case ("-i"):
                synchronized (allPeople) {
                    infoPeople(args);
                    break;
                }
            default:
                System.out.println("fail");

        }
    }


    private synchronized static void createPeople(String[] args) {
        if (((args.length - 1) % 3) == 0) {
            int count_create = (args.length - 1) / 3;
            int i = 1;
            for (int iter = 0; iter < count_create; iter++) {
                if (args[i + 1].equals("м")) {
                    allPeople.add(Person.createMale(args[i], dateFormat(args[i + 2])));
                } else if (args[i + 1].equals("ж")) {
                    allPeople.add(Person.createFemale(args[i], dateFormat(args[i + 2])));
                }
                i = i + 3;
                System.out.println(allPeople.size() - 1);
            }

        } else {
            System.out.println("no create");
        }
    }

    private synchronized static void updatePeople(String[] args) {
        if (((args.length - 1) % 4) == 0) {
            int count_update = (args.length - 1) / 4;
            int i = 1;
            for (int iter = 0; iter < count_update; iter++) {
                //System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + allPeople.get(Integer.parseInt(args[i])).getSex() + " " + dateFormat(allPeople.get(Integer.parseInt(args[i])).getBirthDay()));
                if (args[i + 2].equals("м")) {
                    allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                } else if (args[i + 2].equals("ж")) {
                    allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                } else {
                    System.out.println("wrong sex");
                }
                allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                allPeople.get(Integer.parseInt(args[i])).setBirthDay(dateFormat(args[i + 3]));
                //System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + allPeople.get(Integer.parseInt(args[i])).getSex() + " " + dateFormat(allPeople.get(Integer.parseInt(args[i])).getBirthDay()));
                i = i + 4;
            }

        } else {
            System.out.println("no update");
        }
    }

    private synchronized static void deletePeople(String[] args) {
        if (args.length >= 2) {

            for (int i = 1; i < args.length; i++) {
                System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + allPeople.get(Integer.parseInt(args[i])).getSex() + " " + dateFormat(allPeople.get(Integer.parseInt(args[i])).getBirthDay()));
                allPeople.get(Integer.parseInt(args[i])).setName(null);
                allPeople.get(Integer.parseInt(args[i])).setSex(null);
                allPeople.get(Integer.parseInt(args[i])).setBirthDay(null);
                System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + allPeople.get(Integer.parseInt(args[i])).getSex());
            }

        } else {
            System.out.println("no delete");
        }
    }

    private synchronized static void infoPeople(String[] args) {
        String male;
        if (args.length >= 2) {
            for (int i = 1; i < args.length; i++) {
                Date bd = allPeople.get(Integer.parseInt(args[i])).getBirthDay();
                if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE)) {
                    male = "м";
                } else {
                    male = "ж";
                }
                System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + male + " " + dateFormat(bd));
            }
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
        SimpleDateFormat dateSimple = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date doc = null;
        try {
            doc = dateSimple.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return doc;
    }
}
