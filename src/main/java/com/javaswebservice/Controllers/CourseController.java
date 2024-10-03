package com.javaswebservice.Controllers;

import com.javaswebservice.DTOs.CourseDTO;
import com.javaswebservice.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/Courses"})
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<CourseDTO> Courses (){
        return courseService.getAllCourses();
    }

    //word/name
    @GetMapping ("/{word}/name")
    private List<CourseDTO> getAllCoursesByWordInName (@PathVariable String word) {
        return courseService.getAllCoursesByWordInName(word);
    }

    //word/description
    @GetMapping ("/{word}/description")
    private List<CourseDTO> getAllCoursesByWordInDescription (@PathVariable String word) {
        return courseService.getAllCoursesByWordInDescription(word);
    }
}
