package com.javaswebservice.Controllers;

import com.javaswebservice.DTOs.StudentDTO;
import com.javaswebservice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/Students"})
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentDTO> Students (){
        return studentService.getAllStudents();
    }

}
