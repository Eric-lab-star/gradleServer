package webServer.students;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

/**
 * This is a Data Transfer Object (DTO) for Student.
 * It is used to receive student data over the network or between processes.
 * As a record, it has a concise syntax and automatically derives useful methods like equals, hashCode, and toString.
 *
 * @param firstName The first name of the student. It should only contain letters and is required.
 * @param lastName The last name of the student. It should only contain letters and is required.
 * @param email The email address of the student. It should be a valid email address.
 * @param age The age of the student. It should be a number greater than 0 and less than or equal to 300.
 * @param schoolId The unique identifier for the school the student attends.
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
