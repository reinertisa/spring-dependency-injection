package com.reinertisa.springdependencyinjection.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppStudentStartupRunner {

    @Bean(name = "studentRunner")
    public CommandLineRunner run(Student student) {
        return args -> {
            student.showComputer();
            student.showCourses();
        };
    }
}
