package com.javaswebservice.Controllers;

import com.javaswebservice.DTOs.CourseDTO;
import com.javaswebservice.DTOs.RegisteredDTO;
import com.javaswebservice.DTOs.StudentDTO;
import com.javaswebservice.Service.RegisteredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/Registered"})
public class RegisteredController {

    @Autowired
    private RegisteredService registeredService;

    @GetMapping
    public List<RegisteredDTO> registered () {
        return registeredService.getAllRegistered();
    }

    //All courses by student Id
    @GetMapping ("/courses/student/{id}")
    public List<CourseDTO> getCoursesByStudentId (@PathVariable Long id) {
            return registeredService.getCoursesByStudentId(id);
    }

    //AllStudents/Fname/Ritu/courses
    @GetMapping("/AllStudents/Fname/{name}/courses")
    public List<CourseDTO> getCoursesByStudentsFname (@PathVariable String name) {
        return registeredService.getCoursesByStudentsFname(name);
    }

    //AllStudents/Lname/Baier/courses
    @GetMapping ("/AllStudents/Lname/{name}/courses")
    public List<CourseDTO> getCoursesByStudentsLname (@PathVariable String name) {
        return registeredService.getCoursesByStudentsLname(name);
    }

    //AllStudents/Nashua/courses
    @GetMapping ("/AllStudents/{town}/courses")
    public List <CourseDTO> getCoursesByStudentsTown (@PathVariable String town) {
        return registeredService.getCoursesByStudentsTown(town);
    }

    //Course/8/AllStudents
    @GetMapping("/Course/id/{id}/AllStudents")
    public List <StudentDTO> getStudentsByCourseID (@PathVariable Long id) {
        return registeredService.getStudentsByCourseID(id);
    }

    //Course/Java/AllStudents
    @GetMapping ("/Course/name/{name}/AllStudents")
    public List <StudentDTO> getStudentsByCourseName (@PathVariable String name) {
        return registeredService.getStudentsByCourseName(name);
    }
}
