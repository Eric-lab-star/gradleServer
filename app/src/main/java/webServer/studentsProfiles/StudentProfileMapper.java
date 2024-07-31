package webServer.studentsProfiles;

import org.springframework.stereotype.Service;

import webServer.students.Student;

/**
 * StudentProfileMapper
 */
@Service
public class StudentProfileMapper {
	public StudentProfile toStudendtProfile(
			StudentProfileDto dto
	){
		StudentProfile profile = new StudentProfile();
		Student std = new Student();
		std.setId(dto.studentId());
		profile.setBio(dto.bio());
		profile.setStudent(std);
		return profile;
	}
	public StudentProfileResponseDto toResponseDto(
			StudentProfile profile
	){
		StudentProfileResponseDto dto =
			new StudentProfileResponseDto(
					profile.getId(),
					profile.getBio()
			);
		return dto;

	}
}
