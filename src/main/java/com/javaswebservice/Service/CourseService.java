package com.javaswebservice.Service;

import com.javaswebservice.DTOs.CourseDTO;
import com.javaswebservice.Entity.Courses;
import com.javaswebservice.Repositorys.CourseRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService {
    @Autowired
    private CourseRepositories courseRepositories;

    public List<CourseDTO> getAllCourses() {
        return courseRepositories.findAll().stream()
                .map(this::convertToDTO).collect(Collectors.toList());
    }
    //word/name
    public List<CourseDTO> getAllCoursesByWordInName(String word) {
        return courseRepositories.findAllCoursesByWordInName(word)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    //word/description
    public List<CourseDTO> getAllCoursesByWordInDescription(String word) {
        return courseRepositories.findAllCoursesByWordInDescription(word)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private CourseDTO convertToDTO(Courses courses) {
        CourseDTO dtOs = new CourseDTO();
        dtOs.setId(courses.getId());
        dtOs.setName(courses.getName());
        dtOs.setDescription(courses.getDescription());
        return dtOs;
    }

}
