package webServer;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENTS")
    public class Student {
	@Id
	@GeneratedValue
	private	Integer	id;

    @Column(
	name = "c-lname",
	length = 200
    )
    private String lastname;
    private String firstname;

    @Column(
	unique = true
    )
    private String  email;
    private int	    age;


    public Student() {
    }

    public Student(
	String lastname,
	String firstname,
	String email,
	int age
    ) {
	this.lastname = lastname;
	this.firstname = firstname;
	this.email = email;
	this.age = age;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

}
