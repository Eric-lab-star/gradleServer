package webServer.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import webServer.entities.School;

public interface SchoolRepository extends JpaRepository<School, Integer>{

}

