package me.kglawrence.kerilawrence.book_park.models;

/**
 * The basic structure for student data entered into database.
 * Created by keri.lawrence on 9/29/16.
 */
public class Student {

    public String fname;
    public String lname;
    public String readLevel;
    public int imageIndex;

    public Student() {

    }

    public Student(String fname, String lname, String readLevel, int imageIndex) {
        this.fname = fname;
        this.lname = lname;
        this.readLevel = readLevel;
        this.imageIndex = imageIndex;
    }

}
