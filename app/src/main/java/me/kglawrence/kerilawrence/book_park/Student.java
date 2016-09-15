package me.kglawrence.kerilawrence.book_park;
import java.util.List;

/**
 * Created by clarkbd1 on 9/15/2016.
 */
public class Student {

    public String name;
    public char reading_level;
    public List<Book> books_checked_out;
    public LoginIcons icon;

    public Student(String name, char reading_level, List<Book> books_checked_out, LoginIcons icon) {
        this.name = name;
        this.reading_level = reading_level;
        this.books_checked_out = books_checked_out;
        this.icon = icon;
    }

    /** Getter and setters below *//////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks_checked_out() {
        return books_checked_out;
    }

    public void setBooks_checked_out(List<Book> books_checked_out) {
        this.books_checked_out = books_checked_out;
    }

    public LoginIcons getIcon() {
        return icon;
    }

    public void setIcon(LoginIcons icon) {
        this.icon = icon;
    }

    public char getReading_level() {
        return reading_level;
    }

    public void setReading_level(char reading_level) {
        this.reading_level = reading_level;
    }


}
