package com.management.security.dto;

import lombok.Data;

@Data
public class VerifyUserDto {
    private String email;
    private String verificationCode;
}
