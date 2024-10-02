package com.demo.security.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "APP_USER")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String role;

}
