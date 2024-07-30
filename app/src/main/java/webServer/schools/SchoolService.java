package webServer.schools;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * SchoolService
 */
@Service
public class SchoolService {

	private final SchoolRepository repo;
	private final SchoolMapper mapper;
	public SchoolService(
		SchoolRepository schoolRepository,
		SchoolMapper mapper
	) {
		this.repo = schoolRepository;
		this.mapper = mapper;
	}

	public SchoolResponseDto post(
		@RequestBody SchoolDto dto
	) {
		School school = mapper.toSchool(dto);
		School saved = repo.save(school);
		return mapper.toDto(saved);
	}

	public List<SchoolResponseDto> get() {
		List<School> schools = repo.findAll();
		return schools
			.stream()
			.map(school -> mapper.toDto(school))
			.collect(Collectors.toList());
	}
	
}
