package webServer.studentsProfiles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webServer.students.Student;

/**
 * StudentProfile
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class StudentProfile {

    @Id
    @GeneratedValue(
		strategy = GenerationType.IDENTITY
	)
    private	Integer	id;

    private	String	bio;

	@OneToOne
	@JoinColumn(
		name = "student_id"
	)
	private	Student	student;

    public StudentProfile(String bio) {
	    this.bio = bio;
    }
}
