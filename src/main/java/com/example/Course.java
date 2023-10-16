package com.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseID;
    private List<Student> studentsList;

    public Course(String courseName, String courseID) {
        // TODO: Initialize the attributes
        this.courseName = courseName;
        this.courseID = courseID;
        this.studentsList = new ArrayList<Student>();
    }

    // TODO: Implement methods to enroll a student and drop a student
    public List<Student> getStudents() {
        return studentsList;
    }

    public void enrollStudent(Student student) {
        studentsList.add(student);
    }

    public void dropStudent(Student student) {
        studentsList.remove(student);
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }
}
