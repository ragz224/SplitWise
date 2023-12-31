package com.splitwise.Controller;

import com.splitwise.DTO.ResponseStatus;
import com.splitwise.DTO.SignupRequestDto;
import com.splitwise.DTO.SignupResponseDto;
import com.splitwise.Models.User;
import com.splitwise.Services.UserService;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Getter
@Setter
@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignupResponseDto signup(SignupRequestDto signupRequestDto) {
        SignupResponseDto signupResponseDto = new SignupResponseDto();
        User user;
        try {
            user = userService.signup(signupRequestDto.getEmail(), signupRequestDto.getPassword());
            signupResponseDto.setResponseStatus(ResponseStatus.SUCESS);
            signupResponseDto.setUserId((long) user.getId());
        }
        catch (Exception e) {
            signupResponseDto.setResponseStatus(ResponseStatus.FAILED);
        }

        return signupResponseDto;
    }

}
