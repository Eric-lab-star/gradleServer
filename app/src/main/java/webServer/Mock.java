package webServer;

/**
 * Mock
 */
public class Mock {
    private final StudentRepository studentRepository;
	private final SchoolRepository schoolRepository;
    private final String baseAddr= "example.com";
    
    public Mock(
		StudentRepository studentRepository,
		SchoolRepository schoolRepository
	) {
	    this.studentRepository = studentRepository;
		this.schoolRepository= schoolRepository;
    }

	public void fillSchoolRepo(){
		School school = new School("MIT", 1);
		schoolRepository.save(school);
	}


    public void fillStudentRepository() {
		String[][] names = {
			{"Alice", "Wonderland"},
			{"Bob", "Marley"},
			{"Charlie", "Brown"},
			{"David", "Gilmour"},
			{"Eve", "Hewson"},
			{"Frank", "Zappa"},
			{"Grace", "Hopper"},
			{"Hannah", "Montana"},
			{"Ivan", "Ivanov"},
			{"John", "Doe"}
		};

		for (int i = 0; i < names.length; i++) {
			Student student = new Student(
				names[i][1],
				names[i][0],
				names[i][0] + "." + names[i][1] + "@" + baseAddr,
				20 + i
			);
			School school = schoolRepository.findById(1).get();
			student.setSchool(school);
			studentRepository
				.save(student);
		}
    }
}
