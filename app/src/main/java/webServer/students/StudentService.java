package webServer.students;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * StudentService
 */
@Service
public class StudentService {

    private final StudentRepository studentRepository;
	private final StudentMapper studentMapper;
    public StudentService(
		StudentRepository studentRepository,
		StudentMapper studentMapper
	) {
		this.studentMapper = studentMapper;
		this.studentRepository = studentRepository;
	}

	public StudentResponseDto post(
		@RequestBody StudentDto studentDto
    ) {
		Student std = studentMapper.toStudent(studentDto);
		Student saved = studentRepository.save(std);
		return studentMapper.toDto(saved);
    }

    public List<StudentResponseDto> findAll() {
		List<Student> students = studentRepository.findAll();
		return students.stream()
				.map(student ->studentMapper.toDto(student))
				.collect(Collectors.toList());
    }

    public StudentResponseDto findStudentById(
		@PathVariable Integer id
    ) {
		Student st = studentRepository
			.findById(id)
			.orElse(new Student());
		return studentMapper.toDto(st);
    }

    public List<StudentResponseDto> findStudentByName(
		@PathVariable String name
    ) {
		List<Student> lst = studentRepository.findAllByFirstNameContaining(name);
		return lst.stream()
			.map(st -> studentMapper.toDto(st))
			.collect(Collectors.toList());
    }

    public String deleteById(
		@PathVariable Integer id
    ) {
		studentRepository.deleteById(id);
		return "Deleted: " + id;
    }
}
