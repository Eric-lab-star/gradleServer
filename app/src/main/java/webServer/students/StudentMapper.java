package webServer.students;

import org.springframework.stereotype.Service;

import webServer.schools.School;

/**
 * StudentMapper
 */
@Service
public class StudentMapper {


	public StudentSchoolResponseDto toStudentListForSchool(Student std){
		return new StudentSchoolResponseDto(
			std.getId(),
			std.getFirstName(),
			std.getLastName(),
			std.getEmail(),
			std.getAge()
		);
	}

	public StudentResponseDto toDto(Student student) {
		return new StudentResponseDto(
			student.getId(),
			student.getFirstName(),
			student.getLastName(),
			student.getEmail(),
			student.getAge(),
			student.getSchool().getId()
		);
	}

	public Student toStudent(StudentDto dto){
		School sch = new School();
		sch.setId(dto.schoolId());
		Student st = new Student(
			dto.firstName(),
			dto.lastName(),
			dto.email(),
			dto.age()
		);
		st.setSchool(sch);
		return st;
	}
}
