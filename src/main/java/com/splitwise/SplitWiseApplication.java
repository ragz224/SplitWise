package com.splitwise;

import com.splitwise.Controller.UserController;
import com.splitwise.DTO.SignupRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SplitWiseApplication implements CommandLineRunner {
    @Autowired
    private UserController userController;

    public static void main(String[] args) {
        SpringApplication.run(SplitWiseApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        SignupRequestDto signupRequestDto = new SignupRequestDto();
        signupRequestDto.setEmail("ragven01@gmail.com");
        signupRequestDto.setPassword("ragven");
        userController.signup(signupRequestDto);

    }
}


