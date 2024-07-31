package webServer.singer;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webServer.songs.Song;

/**
 * Singer
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Singer {
	@Id
	@GeneratedValue
	private Integer id;

	private String name;


	@OneToMany
	private List<Song> song;
}
