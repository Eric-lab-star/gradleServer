package webServer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students") // optional notation for table name
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 200)
    private String lastName;

    private String firstName;

    @Column(unique = true)
    private String  email;

    private int	age;

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
