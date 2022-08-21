package com.railway.dto;

import com.railway.enums.Exemption;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    @Pattern(regexp="[A-Z][a-z]+", message="Invalid name")
    private String name;
    @Pattern(regexp="[A-Z][a-z]+", message="Invalid surname")
    private String surname;
    @Pattern(regexp="UA[a-zA-Z\\d]{10}ID", message="Invalid idCard")
    private String idCard;
    private Exemption exemption;}
