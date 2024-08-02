package webServer.students;

import jakarta.validation.constraints.NotEmpty;

/**
 * StudentDto
 */
public record StudentDto(
	@NotEmpty(
		message = "First name is required"
	)
	String  firstName,
	@NotEmpty(
		message = "Last name is required"
	)
	String  lastName,
	String  email,
	Integer age,
	Integer schoolId
) {
}
