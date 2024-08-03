package webServer.students;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

/**
 * StudentDto
 */
public record StudentDto(
	@NotEmpty(
		message = "First name is required"
	)
	@Pattern(
		regexp = "^[a-zA-Z]+$",
		message = "First name should only contain letters"
	)
	String  firstName,

	@NotEmpty(
		message = "Last name is required"
	)
	@Pattern(
		regexp = "^[a-zA-Z]+$",
		message = "Last name should only contain letters"
	)
	String  lastName,

	@Email(
		message = "Email should be valid",
		regexp = "^(.+)@(.+)$"
	)
	String  email,


	@Max(
		value = 300,
		message = "Age should be a number"
	)
	@Min(
		value = 0,
		message = "Age should greater than 0"
	)
	Integer age,
	Integer schoolId
) {
}
