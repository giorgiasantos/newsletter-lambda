package com.example.newsletter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class NewsletterApplication {
    @Bean
    public Function<String, String> upperCase() {
        return value -> value.toUpperCase();
    }

    @Bean
    public Supplier<String> hello() {
        return () -> "Hello, Spring Cloud Function!";
    }

    public static void main(String[] args) {
        SpringApplication.run(NewsletterApplication.class, args);
    }

}
