package com.javaswebservice.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDTO {
    private Long id;
    private String fname;
    private String lname;
    private String town;
}
