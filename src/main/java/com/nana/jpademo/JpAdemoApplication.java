package com.nana.jpademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpAdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpAdemoApplication.class, args);
    }
        @Bean
        public CommandLineRunner run(EmployeeRepository repository){
            return (args ->{

                insertJavaAdvocates(repository);
                System.out.println(repository.findAll());
            });
        }

    private void insertJavaAdvocates(EmployeeRepository repository){
        repository.save(new Employee("Chris","Pine"));
        repository.save(new Employee("Mandy","Mc Knight"));
        repository.save(new Employee("Viktor","Van Doom"));
        repository.save(new Employee("Peter","Parker"));
    }
}
