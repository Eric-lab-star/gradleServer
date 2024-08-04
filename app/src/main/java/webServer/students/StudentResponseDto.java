package webServer.students;

/**
 * StudentResponseDto
 *
 * @param id The unique identifier for the student
 * @param firstName The first name of the student
 * @param lastName The last name of the student
 * @param email The email address of the student
 * @param age The age of the student
 * @param schoolId The unique identifier for the school the student attends
 */

public record StudentResponseDto(
	Integer id,
	String firstName,
	String lastName,
	String email,
	Integer age,
	Integer schoolId
) {
}
