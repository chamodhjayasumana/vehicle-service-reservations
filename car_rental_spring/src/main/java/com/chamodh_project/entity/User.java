package com.chamodh_project.entity;
import com.chamodh_project.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;

    private String email;

    private String password;

    private UserRole userRole;

}
