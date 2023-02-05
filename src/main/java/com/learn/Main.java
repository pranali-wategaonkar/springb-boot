package com.learn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/data")
    Data getData() {
        Data data = new Data(
                "Hello",
                List.of("Java","Scala","Python"),
                new Person("Akshay", 30, 25000));
        return data;
    }
    record Person(String name, int age, double savings){}
    record Data(String greet, List<String> favProgrammingLanguages, Person person) {}
}