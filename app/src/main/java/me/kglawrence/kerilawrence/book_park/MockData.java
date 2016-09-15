package me.kglawrence.kerilawrence.book_park;
import java.util.List;

/**
 * Created by clarkbd1 on 9/15/2016.
 */
public class MockData implements IMockData{

    private List<Student> myClass;

    public MockData(List<Student> students) {
        myClass = students;
    }

    public List<Student> getStudents() {
        return myClass;
    }
}
