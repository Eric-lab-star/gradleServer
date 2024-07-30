package webServer.students;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StudentRepository
 */
public interface StudentRepository extends JpaRepository<Student, Integer>{

	List<Student> findAllByFirstNameContaining(String firstName);
}
