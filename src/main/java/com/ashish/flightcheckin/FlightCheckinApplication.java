package com.ashish.flightcheckin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ashish")
public class FlightCheckinApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightCheckinApplication.class, args);
    }

}

