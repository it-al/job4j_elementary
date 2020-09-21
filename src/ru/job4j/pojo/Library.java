package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Книга1", 100);
        books[1] = new Book("Книга2", 200);
        books[2] = new Book("Книга3", 300);
        books[3] = new Book("Clean code", 500);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getCount());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getCount());
        }
        Book cleanCodeBook = new Book("Clean code", 500);
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(cleanCodeBook)) {
                System.out.println(books[i].getName() + " - " + books[i].getCount());
            }
        }
    }
}
