package webServer.dtos;

import java.util.List;

public record SchoolResponseDto(
	Integer id,
	String name,
	List<StudentResponseDto> students
) {
}
