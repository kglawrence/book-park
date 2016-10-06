package me.kglawrence.kerilawrence.book_park.models;

/**
 * Created by keri.lawrence on 10/6/16.
 */

public class CheckedOut {
    public int studentId;
    public int bookId;

    public CheckedOut() {

    }

    public CheckedOut(int studentId, int bookId) {
        this.studentId = studentId;
        this.bookId = bookId;
    }
}
