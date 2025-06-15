package com.reinertisa.springdependencyinjection.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component(value = "student")
@Scope("singleton")
public class Student {

    private Long id;
    private String name;
    private List<Course> courses = new ArrayList<>();
    private Computer computer;

    @Autowired
    public void setCourses(List<Course> courses) {
        this.courses = new ArrayList<>(courses);
    }

    @Autowired
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Computer getComputer() {
        return computer;
    }

    public void showComputer() {
        System.out.println(computer);
    }

    public void showCourses() {
        courses.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                ", computer=" + computer +
                '}';
    }
}
