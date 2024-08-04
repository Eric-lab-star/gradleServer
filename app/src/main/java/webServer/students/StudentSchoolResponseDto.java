package webServer.students;

/**
 * This is a Data Transfer Object (DTO) for Student with school information.
 * It is used to send student data along with school information over the network or between processes.
 * As a record, it has a concise syntax and automatically derives useful methods like equals, hashCode, and toString.
 *
 * @param id The unique identifier for the student
 * @param firstName The first name of the student
 * @param lastName The last name of the student
 * @param email The email address of the student
 * @param age The age of the student
 */
public record StudentSchoolResponseDto(
	Integer id,
	String firstName,
	String lastName,
	String email,
	Integer age
) {
}
