package webServer.studentsProfiles;

import java.util.List;

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

	public List<StudentProfile> get(){
		List<StudentProfile> profiles = studentprofileRepository.findAll();
		return profiles;
	}

	public StudentProfile post(
		StudentProfileDto profileDto
	){
		StudentProfile profile = studentProfileMapper.toStudendtProfile(profileDto);  
		StudentProfile newProfile = studentprofileRepository.save(profile);
		return newProfile;
	}
}
