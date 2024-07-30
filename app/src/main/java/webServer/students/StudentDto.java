package webServer.students;

/**
 * StudentDto
 */
public record StudentDto(
	String  lastName,
	String  firstName,
	String  email,
	Integer age,
	Integer schoolId
) {
}
