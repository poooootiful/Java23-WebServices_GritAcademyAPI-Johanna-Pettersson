package com.javaswebservice.Service;

import com.javaswebservice.DTOs.StudentDTO;
import com.javaswebservice.Entity.Students;
import com.javaswebservice.Repositorys.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    private StudentRepositories studentRepositories;

    public List<StudentDTO> getAllStudents () {
        return studentRepositories.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private StudentDTO convertToDTO(Students student) {
        StudentDTO dtOs = new StudentDTO();
        dtOs.setId(student.getId());
        dtOs.setFname(student.getFname());
        dtOs.setLname(student.getLname());
        dtOs.setTown(student.getTown());
        return dtOs;
    }
}
