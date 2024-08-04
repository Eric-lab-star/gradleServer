package students;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import webServer.schools.School;
import webServer.students.Student;
import webServer.students.StudentDto;
import webServer.students.StudentMapper;
import webServer.students.StudentRepository;
import webServer.students.StudentResponseDto;
import webServer.students.StudentService;

/**
 * StudentServiceTest
 */
public class StudentServiceTest {

	// test target
	@InjectMocks
	private StudentService studentService;

	//dependencies
	@Mock
    private StudentRepository studentRepository;
	@Mock
	private StudentMapper studentMapper;

	@BeforeEach
	public void setup(){
		MockitoAnnotations.openMocks(this);
		
	}

	@Test
	public void should_save_student(){
		//given
		StudentDto studentDto = new StudentDto(
				"Alice",
				"Green",
				"alice@email.com",
				12,
				1
		);

		Student student = new Student(
				"Alice", 
				"Green",
				"alice@email.com",
				12
		);
		School school = new School();
		school.setId(1);
		student.setSchool(school);
		
		Student savedStudent= new Student(
				"savedAlice", 
				"Green",
				"alice@email.com",
				12
		);
		School savedSchool= new School();
		savedSchool.setId(1);
		savedStudent.setSchool(savedSchool);
		savedStudent.setId(1);

		StudentResponseDto studentResponseDto =
			new StudentResponseDto(
				1,
				"Alice",
				"Green",
				"alice@email.com",
				12,
				1
			);

		//mock the calls
		when(studentMapper.toStudent(studentDto))
			.thenReturn(student);
		when(studentRepository.save(student))
			.thenReturn(savedStudent);

		when(studentMapper.toDto(savedStudent)).thenReturn(studentResponseDto);

		// when
		StudentResponseDto actualResponse = studentService.post(studentDto);

		// Then
		assertEquals(studentDto.firstName(), actualResponse.firstName());
		assertEquals(studentDto.lastName(), actualResponse.lastName());
		assertEquals(studentDto.email(), actualResponse.email());
		
		
	}
}
