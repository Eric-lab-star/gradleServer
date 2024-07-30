package webServer.students;

/**
 * StudentResponseDto
 */
public record StudentResponseDto(
	Integer id,
	String lastName,
	String firstName,
	String email,
	Integer age,
	Integer schoolId
) {
}
