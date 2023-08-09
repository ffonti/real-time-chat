package com.example.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BeApplication {

    private static Environment env;


    public BeApplication(Environment env) {
        BeApplication.env = env;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeApplication.class, args);
        System.out.println("Server listening on port " + env.getProperty("server.port"));
    }
}
