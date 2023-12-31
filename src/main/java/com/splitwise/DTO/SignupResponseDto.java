package com.splitwise.DTO;

import com.splitwise.Models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupResponseDto {
    private ResponseStatus responseStatus;
    private Long userId;
}
