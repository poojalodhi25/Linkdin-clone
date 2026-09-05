package com.linkdinproject.user_service.controller;

import com.linkdinproject.user_service.dto.LoginRequestDto;
import com.linkdinproject.user_service.dto.SignupRequestDto;
import com.linkdinproject.user_service.dto.UserDto;
import com.linkdinproject.user_service.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {
    private final AuthService authService;
    @PostMapping("/singup")
    public ResponseEntity<UserDto>singUp(@RequestBody SignupRequestDto signupRequestDto){
        UserDto userDto = authService.signUp(signupRequestDto);
        return  new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDto loginRequestDto) {
        String token = authService.login(loginRequestDto);
        return ResponseEntity.ok(token);
    }
}
