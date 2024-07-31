package webServer.singer;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * SingerRepo
 */
public interface SingerRepo extends JpaRepository<Singer, Integer> {

	
}
