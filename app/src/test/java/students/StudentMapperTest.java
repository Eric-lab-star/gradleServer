package students;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import webServer.schools.School;
import webServer.students.Student;
import webServer.students.StudentDto;
import webServer.students.StudentMapper;
import webServer.students.StudentResponseDto;

/**
 * StudentMappterTest
 */
public class StudentMapperTest {
	private StudentMapper studentMapper;

	@BeforeEach
	public void setup(){
		studentMapper = new StudentMapper();
	}


	@Test
	public void shouldMapStudentDtoToStudent(){
		StudentDto dto = new StudentDto("Alice", "Green", "greeisalice@google.com", 12, 1);
		Student student = studentMapper.toStudent(dto);
		assertEquals(dto.firstName(), student.getFirstName());
		assertEquals(dto.lastName(), student.getLastName());
		assertEquals(dto.email(), student.getEmail());
		assertEquals(dto.age(), student.getAge());
		assertNotNull(student.getSchool());
		assertEquals(dto.schoolId(), student.getSchool().getId());
	}

	@Test
	public void shouldMapStudentToStudentResponseDto(){
		School school = new School("high school");
		school.setId(1);
		Student student =
			new Student(
				"Alice",
				"Green",
				"aliceisgreen@email.com",
				12
			);
		student.setSchool(school);
    	StudentResponseDto dto = studentMapper.toDto(student);
		assertEquals(dto.firstName(), student.getFirstName());
		assertEquals(dto.lastName(), student.getLastName());
		assertEquals(dto.email(), student.getEmail());
		assertEquals(dto.age(), student.getAge());
		assertEquals(dto.schoolId(), student.getSchool().getId());
	}
}
