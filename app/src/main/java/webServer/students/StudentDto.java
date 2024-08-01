package webServer.students;

import jakarta.validation.constraints.NotEmpty;

/**
 * StudentDto
 */
public record StudentDto(
		@NotEmpty
		String  firstName,
		@NotEmpty
		String  lastName,
		String  email,
		Integer age,
		Integer schoolId
) {
}
