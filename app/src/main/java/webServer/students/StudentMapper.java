package webServer.students;

import org.springframework.stereotype.Service;

import webServer.schools.School;

/** StudentMapper */
@Service
public class StudentMapper {

	public StudentSchoolResponseDto toStudentListForSchool(Student student) {
		return new StudentSchoolResponseDto(
					student.getId(),
					student.getFirstName(),
					student.getLastName(),
					student.getEmail(),
					student.getAge()
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

    public Student toStudent(StudentDto studentDto) {
        School sch = new School();
        sch.setId(studentDto.schoolId());
        Student st = 
			new Student(
				studentDto.firstName(),
				studentDto.lastName(),
				studentDto.email(),
				studentDto.age()
			);
        st.setSchool(sch);
        return st;
    }
}
