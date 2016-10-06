package me.kglawrence.kerilawrence.book_park.models;

/**
 * The basic structure for book data entered into database.
 * Created by keri.lawrence on 9/29/16.
 */
public class Book {

    public String title;
    public String author;
    public String barcode;

    public Book() {

    }

    public Book(String title, String author,  String barcode) {
        this.title = title;
        this.author = author;
        this.barcode = barcode;
    }
}
