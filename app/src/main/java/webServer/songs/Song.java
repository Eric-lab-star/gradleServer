package webServer.songs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webServer.singer.Singer;

/**
 * Song
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Song {
	@Id
	@GeneratedValue
	private Integer id;

	private String title;

	@ManyToOne
	private Singer singer;
}
