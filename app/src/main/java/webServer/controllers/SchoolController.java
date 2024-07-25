package webServer.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import webServer.dtos.SchoolDto;
import webServer.dtos.SchoolResponseDto;
import webServer.entities.School;
import webServer.repos.SchoolRepository;

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
		List<SchoolResponseDto> schoolDtos = new ArrayList<SchoolResponseDto>();

		for (School school: schools){
			schoolDtos.add(school.toDto());
		}
		return schoolDtos;
	}
	
}
