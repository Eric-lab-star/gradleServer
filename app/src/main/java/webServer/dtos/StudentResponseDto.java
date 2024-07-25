package webServer.dtos;

/**
 * StudentResponseDto
 */
public record StudentResponseDto(
	Integer id,
	String lastName,
	String firstName,
	String email,
	Integer schoolId
) {
}
