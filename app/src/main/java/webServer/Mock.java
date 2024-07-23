package webServer;

/**
 * Mock
 */
public class Mock {
    private final StudentRepository studentRepository;
    private final String baseEmail = "example.com";
    
    public Mock(StudentRepository studentRepository) {
	    this.studentRepository = studentRepository;
    }


    public void fillStudentRepository() {
	String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ivan", "John"};
	for (int i = 0; i < names.length; i++) {
	    studentRepository.save(new Student(names[i], names[i], names[i] + "@" + baseEmail, 20 + i));
	}
    }

}
