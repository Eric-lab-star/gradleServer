package webServer.students;

import org.springframework.stereotype.Service;

import webServer.schools.School;
/**
 * This is a service class for mapping between Student and StudentDto objects.
 * It provides methods to convert from Student to StudentDto and vice versa.
 * It also provides a method to convert from Student to StudentSchoolResponseDto.
 */
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
		System.out.println(student);
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
