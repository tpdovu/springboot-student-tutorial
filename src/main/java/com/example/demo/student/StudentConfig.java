package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tony = new Student(
                    "Tony",
                    "tpdovu@gmail.com",
                    LocalDate.of(1993, Month.OCTOBER, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1992, Month.JANUARY, 14)
            );

//            repository.saveAll(
//                    List.of(tony, alex)
//            );
        };
    }
}
