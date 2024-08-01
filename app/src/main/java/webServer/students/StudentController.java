package webServer.students;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** FirstController */
@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(
			StudentService studentService
		) {
      this.studentService = studentService;
    }

    @PostMapping("/students")
    public StudentResponseDto post(
			@RequestBody StudentDto studentDto
		) {
      return studentService.post(studentDto);
    }

    @GetMapping("/students")
    public List<StudentResponseDto> findAll() {
			return studentService.findAll();
    }

    @GetMapping("/students/{id}")
    public StudentResponseDto findStudentById(
			@PathVariable Integer id
		) {
			return studentService.findStudentById(id);
    }

    @GetMapping("/students/search/{name}")
    public List<StudentResponseDto> findStudentByName(
			@PathVariable String name
		) {
      return studentService.findStudentByName(name);
    }

    @DeleteMapping("/students/{id}")
    public String deleteById(
			@PathVariable Integer id
		) {
      return studentService.deleteById(id);
    }
}
