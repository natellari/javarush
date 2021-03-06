package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;

            String output = "output";
            //Add your code here

/*            if (this.getClass().getSimpleName().equals("AgathaChristieBook"))
                System.out.println(agathaChristieOutput);
            if (this.getClass().getSimpleName().equals("MarkTwainBook"))
                System.out.println(markTwainOutput);*/
            if (this instanceof AgathaChristieBook)
                return agathaChristieOutput;
            if (this instanceof  MarkTwainBook)
                return markTwainOutput;

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book{
        private String title;

        public MarkTwainBook(String author) {
            super("Mark Twain");
            this.title = author;
        }


        //not works
        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

    public static class AgathaChristieBook extends Book{
        private String title;

        public AgathaChristieBook(String author) {
            super("Agatha Christie");
            this.title = author;
        }

        //not works
        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
}
