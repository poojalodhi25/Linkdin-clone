package com.linkdinproject.user_service.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String email, password;
}
