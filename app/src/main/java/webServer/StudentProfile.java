package webServer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * StudentProfile
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class StudentProfile {

    @Id
    @GeneratedValue
    private Integer id;

    private String bio;

    public StudentProfile(String bio) {
	    this.bio = bio;
    }
}
