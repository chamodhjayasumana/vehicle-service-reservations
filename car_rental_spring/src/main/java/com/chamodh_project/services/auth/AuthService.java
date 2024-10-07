package com.chamodh_project.services.auth;

import com.chamodh_project.dto.SignupRequest;
import com.chamodh_project.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);
}
