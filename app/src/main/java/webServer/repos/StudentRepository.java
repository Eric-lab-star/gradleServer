package webServer.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import webServer.entities.Student;

/**
 * StudentRepository
 */
public interface StudentRepository extends JpaRepository<Student, Integer>{
    List<Student> findAllByFirstNameContaining(String firstName);
}
