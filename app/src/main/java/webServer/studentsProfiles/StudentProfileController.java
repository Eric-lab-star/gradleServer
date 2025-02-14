package webServer.studentsProfiles;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * StudentProfileController
 */
@RestController
public class StudentProfileController {
	public final StudentProfileService service;

	public StudentProfileController(StudentProfileService service) {
		this.service = service;
	}

	@GetMapping("/studentProfiles")
	public List<StudentProfileResponseDto>get(){
		return service.get();
	}

	@PostMapping("/studentProfiles")
	public StudentProfileDto post(
		@RequestBody StudentProfileDto profile
	){
		return service.post(profile);
	}
	
}
