package webServer;

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

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
	this.studentRepository = studentRepository;
    }

    @PostMapping("/students")
    public StudentResponseDto post(
		@RequestBody StudentDto studentDto
    ) {
		Student student = toStudent(studentDto);
		Student saved = studentRepository.save(student);
		return new StudentResponseDto(
				saved.getFirstName(),
				saved.getLastName(),
				saved.getEmail()
				);
    }

	private Student toStudent(StudentDto dto) {
		Student st = new Student();
		st.setFirstName(dto.firstName());
		st.setLastName(dto.lastName());
		st.setEmail(dto.email());
		School school = new School();
		school.setId(dto.schoolId());
		st.setSchool(school);
		return st;
	}

    @GetMapping("/students")
    public List<Student> findAll() {
	return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Student findStudentById(
	@PathVariable Integer id
    ) {
	return studentRepository
		.findById(id)
		.orElse(new Student());
    }

    @GetMapping("/students/search/{name}")
    public List<Student> findStudentByName(
	@PathVariable String name
    ) {
	return studentRepository.findAllByFirstNameContaining(name);

    }

    @DeleteMapping("/students/{id}")
    public String deleteById(
	@PathVariable Integer id
    ) {
	studentRepository.deleteById(id);
	return "Deleted: " + id;
    }

}
