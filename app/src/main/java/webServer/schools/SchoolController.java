package webServer.schools;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * SchoolController
 */
@RestController
public class SchoolController {

	private final SchoolService service;
	public SchoolController(SchoolService service) {
		this.service = service;
	}
	@GetMapping("/schools")
	public List<SchoolResponseDto> get() {
		return service.get();
	}

	@PostMapping("/schools")
	public SchoolResponseDto post(
		@RequestBody SchoolDto dto
	) {
		return service.post(dto);
	}


}
