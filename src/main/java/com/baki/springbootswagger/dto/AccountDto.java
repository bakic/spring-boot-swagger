package com.baki.springbootswagger.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {

    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime dateOfBirth;
}
