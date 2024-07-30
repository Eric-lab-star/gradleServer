package webServer.schools;

import java.util.List;

import webServer.students.StudentResponseDto;

public record SchoolResponseDto(
	Integer id,
	String name,
	List<StudentResponseDto> students
) {
}
