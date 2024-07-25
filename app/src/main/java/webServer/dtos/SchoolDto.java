package webServer.dtos;

import webServer.entities.School;

/**
 * SchoolDto
 */
public record SchoolDto(
	String  name
) {
	public School toSchool(){
		School school = new School(this.name);
		return school;
	}
}
