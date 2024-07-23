package webServer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * School
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
public class School {

    @Id
    @GeneratedValue
    private Integer id;
    
    private String name;

    public School(String name) {
	this.name = name;
    }
}
