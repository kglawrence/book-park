package me.kglawrence.kerilawrence.book_park;

/**
 * Created by clarkbd1 on 9/15/2016.
 */
public class Book {

    public String name;
    public String author;
    public String barcode;
    public char reading_level;
    public int duplicate_num;
    public Student caretaker;
    public boolean checked_out;

    public Book(String name, String author, String barcode, char reading_level, int duplicate_num, Student caretaker, boolean checked_out) {
        this.name = name;
        this.author = author;
        this.barcode = barcode;
        this.reading_level = reading_level;
        this.duplicate_num = duplicate_num;
        this.caretaker = caretaker;
        this.checked_out = checked_out;
    }

    /** getters and setters below! *///////////////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public char getReading_level() {
        return reading_level;
    }

    public void setReading_level(char reading_level) {
        this.reading_level = reading_level;
    }

    public int getDuplicate_num() {
        return duplicate_num;
    }

    public void setDuplicate_num(int duplicate_num) {
        this.duplicate_num = duplicate_num;
    }

    public Student getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(Student caretaker) {
        this.caretaker = caretaker;
    }

    public boolean isChecked_out() {
        return checked_out;
    }

    public void setChecked_out(boolean checked_out) {
        this.checked_out = checked_out;
    }
}
