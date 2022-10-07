package com.insurance.westco.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository) {
        return args-> {
            Customer nick = new Customer(
                    "nick",
                    "nmeyerg@gmail.com",
                    "602-622-6098",
                    "5345 e van buren st"
            );
            Customer tyler = new Customer(
                    "tyler",
                    "tylerwilkins@gmail.com",
                    "602-555-8888",
                    "123 main st"
            );

            repository.saveAll(
                    List.of(nick,tyler)
            );
        };
    }
}
