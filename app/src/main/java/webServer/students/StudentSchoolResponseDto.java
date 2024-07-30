package webServer.students;

/**
 * StudentSchoolResponseDto
 */
public record StudentSchoolResponseDto(
	Integer id,
	String firstName,
	String lastName,
	String email,
	Integer age
) {
}
