package webServer.entities;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webServer.dtos.SchoolResponseDto;
import webServer.dtos.StudentResponseDto;
/**
 * School
 * @Param id
 * @Param name school name
 * @Param students list of students
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
public class School {
	@Id
    @GeneratedValue
	private	Integer	id;

	private	String	name;

	@OneToMany(
		mappedBy = "school"
	)
	private List<Student> students;

    public  School(
		String  name
    ) {
		this.name = name;
    }

	public SchoolResponseDto toDto(){
		List<StudentResponseDto> studentDtos = new ArrayList<StudentResponseDto>();
		for(Student student: this.students){
			studentDtos.add(student.toDto());
		}
		return new SchoolResponseDto(
			this.id,
			this.name,
			studentDtos
		);
	}
}
