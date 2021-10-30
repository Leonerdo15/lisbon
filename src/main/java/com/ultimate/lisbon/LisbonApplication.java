package com.ultimate.lisbon;

import com.ultimate.lisbon.models.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LisbonApplication {

    public static void main(String[] args) {
        UserRepository.populate();
        SpringApplication.run(LisbonApplication.class, args);
    }

}
