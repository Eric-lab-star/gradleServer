package webServer.songs;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * SongRepo
 */
public interface SongRepo extends JpaRepository<Song, Integer> {

	
}
