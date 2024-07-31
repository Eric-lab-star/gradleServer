package webServer.students;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webServer.schools.School;
import webServer.studentsProfiles.StudentProfile;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    private	String	lastName;
    private	String	firstName;

    private	String	email;
    private	int	age;

	@OneToOne(
		mappedBy = "student"
	)
	private StudentProfile studentProfile;

	@ManyToOne
	@JoinColumn(
		name = "school_id"
	)
	private School school;

    public Student(
		String lastname,
		String firstname,
		String email,
		int    age
    ) {
		this.lastName  = lastname;
		this.firstName = firstname;
		this.email     = email;
		this.age       = age;
    }
	
}
