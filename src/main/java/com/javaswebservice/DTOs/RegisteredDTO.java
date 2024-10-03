package com.javaswebservice.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegisteredDTO {
    private Long id;
    private Long studentid;
    private Long courseid;
}
