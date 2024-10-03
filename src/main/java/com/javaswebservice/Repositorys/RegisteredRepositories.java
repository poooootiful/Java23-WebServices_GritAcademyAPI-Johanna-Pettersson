package com.javaswebservice.Repositorys;

import com.javaswebservice.Entity.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RegisteredRepositories extends JpaRepository <Registered, Long> {
    //All courses by student Id
    @Query("SELECT r FROM Registered r WHERE r.students.id = :studentId")
    List<Registered> findAllByStudentId(@Param("studentId") Long studentId);

    //AllStudents/Fname/name/courses
    @Query ("SELECT r FROM Registered r WHERE r.students.Fname = :fname")
    List<Registered> findAllByStudentFname(@Param("fname") String fname);

    //AllStudents/Lname/name/courses
    @Query("SELECT r FROM Registered r WHERE r.students.Lname = :lname")
    List<Registered> findAllByStudentLname(@Param("lname") String lname);

    //AllStudents/town/courses
    @Query("SELECT r FROM Registered r WHERE r.students.Town = :town")
    List<Registered> findAllByStudentTown (@Param("town") String town);

    // Course/id/AllStudents
    @Query("SELECT r FROM Registered r WHERE r.courses.id = :courseId")
    List<Registered> findAllByCourseId(@Param("courseId") Long courseId);

    // Course/name/AllStudents
    @Query("SELECT r FROM Registered r WHERE r.courses.Name = :name")
    List<Registered> findAllByCourseName(@Param("name") String name);
}
