package com.chamodh_project.dto;

import com.chamodh_project.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private  String name;

    private String email;

    private UserRole userRole;

}
