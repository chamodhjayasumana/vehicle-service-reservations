package com.chamodh_project.controller;

import com.chamodh_project.dto.SignupRequest;
import com.chamodh_project.dto.UserDto;
import com.chamodh_project.services.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer(@RequestBody SignupRequest singupRequst){
        UserDto createdCustomerDto = authService.createCustomer(singupRequst);
        if (createdCustomerDto == null)return new ResponseEntity<>
                ("Customer not created, come again later", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(createdCustomerDto,HttpStatus.CREATED);

    }

}
