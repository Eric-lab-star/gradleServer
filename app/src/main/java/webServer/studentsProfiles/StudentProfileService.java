package webServer.studentsProfiles;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * StudentProfileService
 */
@Service
public class StudentProfileService {
	private final StudentProfileRepository studentprofileRepository;

	public StudentProfileService(
		StudentProfileRepository studentprofileRepository
	) {
		this.studentprofileRepository = studentprofileRepository;
	}

	public List<StudentProfile> get(){
		List<StudentProfile> profiles = studentprofileRepository.findAll();
		return profiles;
	}

	public StudentProfile post(StudentProfile profile){
		StudentProfile newProfile = studentprofileRepository.save(profile);
		return newProfile;
	}
}
