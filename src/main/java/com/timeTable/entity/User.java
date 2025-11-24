package com.timeTable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    int id;
    String username;
    String password;
    String email;
    LocalDateTime createAt;

}
