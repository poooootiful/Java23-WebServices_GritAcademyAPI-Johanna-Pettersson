package com.javaswebservice.Repositorys;

import com.javaswebservice.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositories extends JpaRepository<Students,Long> {

}
