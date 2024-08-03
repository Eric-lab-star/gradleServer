package webServer.students;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(
		StudentService studentService
	) {
		this.studentService = studentService;
    }

    @PostMapping("/students")
    public StudentResponseDto post(
		@Valid @RequestBody StudentDto studentDto
	) {
		return studentService.post(studentDto);
    }

    @GetMapping("/students")
    public List<StudentResponseDto> findAll() {
		return studentService.findAll();
    }

    @GetMapping("/students/{id}")
    public StudentResponseDto findStudentById(
		@PathVariable Integer id
	) {
		return studentService.findStudentById(id);
    }

    @GetMapping("/students/search/{name}")
    public List<StudentResponseDto> findStudentByName(
		@PathVariable String name
	) {
    	return studentService.findStudentByName(name);
    }

    @DeleteMapping("/students/{id}")
    public String deleteById(
		@PathVariable Integer id
	) {
		return studentService.deleteById(id);
    }

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(
		MethodArgumentNotValidException exp
	){
		var errors = new HashMap<String, String>();
		exp.getBindingResult()
			.getFieldErrors()
			.forEach(
			error -> {
				var fieldName = ((FieldError)error).getField();
				var errorMessage = error.getDefaultMessage();
				errors.put(fieldName, errorMessage);

			});
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<?> handleHttpMessageNotReadableException(
		HttpMessageNotReadableException exp
	){
		var errors = new HashMap<String, String>();
		errors.put("error", exp.getMessage());
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
}
