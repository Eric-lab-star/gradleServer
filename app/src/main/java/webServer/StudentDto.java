package webServer;

/**
 * StudentDto
 */
public record StudentDto(
	String  lastName,
	String  firstName,
	String  email,
	Integer schoolId
) {
}
