package com.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<String> coursesList;

    public Student(String name, int id) {
        // TODO: Initialize the attributes
        this.name = name;
        this.id = id;
        this.coursesList = new ArrayList<String>();
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCourse(String courseName) {
        coursesList.add(courseName);
    }

    public List<String> getCoursesList() {
        return coursesList;

}
}