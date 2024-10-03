package com.javaswebservice.Service;

import com.javaswebservice.DTOs.CourseDTO;
import com.javaswebservice.DTOs.RegisteredDTO;
import com.javaswebservice.DTOs.StudentDTO;
import com.javaswebservice.Entity.Registered;
import com.javaswebservice.Entity.Students;
import com.javaswebservice.Repositorys.RegisteredRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegisteredService {
    @Autowired
    private RegisteredRepositories registeredRepositories;

    public List<RegisteredDTO> getAllRegistered () {
        return registeredRepositories.findAll().stream()
                .map(this::convertToRegisteredDTO)
                .collect(Collectors.toList());
    }
    //All courses by student Id
    public List<CourseDTO> getCoursesByStudentId (Long studentId) {
        return registeredRepositories.findAllByStudentId(studentId)
                .stream()
                .map(this::convertToCourseDTO)
                .collect(Collectors.toList());
    }
    //AllStudents/Fname/Syd/courses
    public List<CourseDTO> getCoursesByStudentsFname (String fname) {
        return registeredRepositories.findAllByStudentFname(fname)
                .stream()
                .map(this::convertToCourseDTO)
                .collect(Collectors.toList());
    }

    //AllStudents/Lname/Darien/courses
    public List<CourseDTO> getCoursesByStudentsLname (String lname) {
        return registeredRepositories.findAllByStudentLname(lname)
                .stream()
                .map(this::convertToCourseDTO)
                .collect(Collectors.toList());
    }

    //AllStudents/Darlington/courses
    public List<CourseDTO> getCoursesByStudentsTown (String town) {
        return registeredRepositories.findAllByStudentTown(town)
                .stream()
                .map(this::convertToCourseDTO)
                .collect(Collectors.toList());
    }

    // Course/8/AllStudents
    public List<StudentDTO> getStudentsByCourseID(Long courseId) {
        return registeredRepositories.findAllByCourseId(courseId)
                .stream()
                .map(this::convertToStudentDTO)
                .collect(Collectors.toList());
    }

    // Course/Java/AllStudents
    public List<StudentDTO> getStudentsByCourseName(String name) {
        return registeredRepositories.findAllByCourseName(name)
                .stream()
                .map(this::convertToStudentDTO)
                .collect(Collectors.toList());
    }

    private RegisteredDTO convertToRegisteredDTO(Registered registered) {
        RegisteredDTO dtOs = new RegisteredDTO();
        dtOs.setId(registered.getId());
        dtOs.setCourseid(registered.getCourses().getId());
        dtOs.setStudentid(registered.getStudents().getId());
        return dtOs;
    }
    private CourseDTO convertToCourseDTO(Registered registered) {
        CourseDTO dtOs = new CourseDTO();
        dtOs.setId(registered.getId());
        dtOs.setName(registered.getCourses().getName());
        dtOs.setDescription(registered.getCourses().getDescription());
        return dtOs;
    }
    private StudentDTO convertToStudentDTO(Registered registered) {
        StudentDTO dto = new StudentDTO();
        dto.setId(registered.getStudents().getId());
        dto.setFname(registered.getStudents().getFname());
        dto.setLname(registered.getStudents().getLname());
        dto.setTown(registered.getStudents().getTown());
        return dto;
    }

}
