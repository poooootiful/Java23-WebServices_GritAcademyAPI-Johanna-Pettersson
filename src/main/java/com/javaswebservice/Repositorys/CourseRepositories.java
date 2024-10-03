package com.javaswebservice.Repositorys;

import com.javaswebservice.Entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CourseRepositories extends JpaRepository<Courses, Long> {
    //word/name
    @Query ("SELECT c FROM Courses c WHERE c.Name LIKE %:word%")
    List<Courses> findAllCoursesByWordInName (@PathVariable("word") String word);

    //word/description
    @Query("SELECT c FROM Courses c WHERE c.Description LIKE %:word%")
    List <Courses> findAllCoursesByWordInDescription (@PathVariable("word") String word);

}
