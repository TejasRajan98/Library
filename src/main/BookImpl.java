package main;

import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Complete Reference");
        book.setYearOfPublication(2021);
        book.setISBN(1004919010L);
        book.setAuthor("Herbert Schildt");
        book.setPrice(2000);
        System.out.println("book.getTitle() = " + book.getTitle());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        System.out.println("book.getISBN() = " + book.getISBN());
        System.out.println("book.getAuthor() = " + book.getAuthor());
        System.out.println("book.getPrice() = " + book.getPrice());
    }
}
