package webServer.studentsProfiles;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

/**
 * StudentProfileService
 */
@Service
public class StudentProfileService {
	private final StudentProfileRepository studentprofileRepository;
	private final StudentProfileMapper studentProfileMapper;

	public StudentProfileService(
		StudentProfileRepository studentprofileRepository,
		StudentProfileMapper studentProfileMapper
	) {
		this.studentprofileRepository = studentprofileRepository;
		this.studentProfileMapper = studentProfileMapper;
	}

	public List<StudentProfileResponseDto> get(){
		List<StudentProfile> profiles = studentprofileRepository.findAll();
		List<StudentProfileResponseDto> response = 
			profiles
			.stream()
			.map(profile -> studentProfileMapper.toResponseDto(profile))
			.collect(Collectors.toList());

		return response;
	}

	public StudentProfileDto post(
		StudentProfileDto profileDto
	){
		StudentProfile profile = studentProfileMapper.toStudendtProfile(profileDto);  
		studentprofileRepository.save(profile);
		return profileDto;
	}
}
