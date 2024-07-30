package webServer.schools;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * SchoolController
 */
@RestController
public class SchoolController {

	private final SchoolRepository schoolRepository;

	public SchoolController(
		SchoolRepository schoolRepository
	) {
		this.schoolRepository = schoolRepository;
	}

	@PostMapping("/schools")
	public SchoolResponseDto createSchool(
		@RequestBody SchoolDto schoolDto
	) {
		School school = schoolDto.toSchool();
		School saved = schoolRepository.save(school);
		SchoolResponseDto response = 
			new SchoolResponseDto(
					saved.getId(),
					saved.getName(),
					null
				);
		return response;
	}

	@GetMapping("/schools")
	public List<SchoolResponseDto> findAll() {
		List<School> schools = schoolRepository.findAll();
		return schools.stream()
					.map(school -> school.toDto())
					.collect(Collectors.toList());
	}
	
}
