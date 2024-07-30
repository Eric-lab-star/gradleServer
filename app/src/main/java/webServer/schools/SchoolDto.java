package webServer.schools;


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
