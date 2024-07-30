package webServer.schools;

import java.util.List;

import webServer.students.StudentSchoolResponseDto;

public record SchoolResponseDto(
	Integer id,
	String name,
	List<StudentSchoolResponseDto> students
) {
}
