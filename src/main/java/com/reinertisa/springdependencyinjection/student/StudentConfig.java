package com.reinertisa.springdependencyinjection.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "courseMath")
    public Course course1() {
        return new Course(1L, "Math");
    }

    @Bean(name = "courseChem")
    public Course course2() {
        return new Course(2L, "Chemistry");
    }

    @Bean(name = "allCourses")
    public List<Course> courses(Course courseMath, Course courseChem) {
        return Arrays.asList(courseMath, courseChem);
    }

    @Bean(name = "comp")
    public Computer computer() {
        return new Computer("Dell", "thinkpad");
    }
}
