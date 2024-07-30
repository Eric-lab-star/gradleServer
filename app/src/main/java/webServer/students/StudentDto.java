package webServer.students;

import webServer.schools.School;

/**
 * StudentDto
 */
public record StudentDto(
	String  lastName,
	String  firstName,
	String  email,
	Integer schoolId
) {
	public Student toStudent() {
		Student st = new Student();
		st.setFirstName(this.firstName());
		st.setLastName(this.lastName());
		st.setEmail(this.email());
		School school = new School();
		school.setId(this.schoolId());
		st.setSchool(school);
		return st;
	}
}
