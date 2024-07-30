package webServer.schools;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import webServer.students.StudentMapper;
import webServer.students.StudentSchoolResponseDto;

/**
 * SchoolMapper
 */
@Service
public class SchoolMapper {
	private final StudentMapper studentMapper;

	public SchoolMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	public SchoolResponseDto toDto(School school){
		var sts = school.getStudents();
		if (sts != null){
			List<StudentSchoolResponseDto> stl =  
				sts.stream()
				.map(st -> studentMapper.toStudentListForSchool(st))
				.collect(Collectors.toList());

			SchoolResponseDto response = 
				new SchoolResponseDto(
					school.getId(),
					school.getName(),
					stl
				);
			return response;
		}

		SchoolResponseDto response = 
			new SchoolResponseDto(
				school.getId(),
				school.getName(),
				null
			);
		return response;
	}

	public School toSchool(SchoolDto dto){
		School school = new School();
		school.setName(dto.name());
		return school;
	}
}
