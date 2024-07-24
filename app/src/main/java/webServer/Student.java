package webServer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 200)
    private	String	lastName;
    private	String	firstName;

    @Column(unique = true)
    private	String	email;
    private	int	age;

	@OneToOne(
		mappedBy = "student", // this "student" must excatly math the field name in StudentProfile.java
		cascade  = CascadeType.ALL
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
