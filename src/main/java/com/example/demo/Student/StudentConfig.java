package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student minal = new Student(
                    "Minu",
                    "minu@gmail.com",
                    LocalDate.of(2003, Month.DECEMBER, 30)
            );

            Student ajinkya = new Student(
                    "Ajinkya",
                    "ajinkya@gmail.com",
                    LocalDate.of(2004, Month.FEBRUARY, 03)
            );

            studentRepository.saveAll(
                    List.of(minal, ajinkya)
            );
        };
    }
}
