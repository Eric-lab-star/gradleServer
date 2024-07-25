package webServer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
		var ctx = SpringApplication.run(App.class, args);
		Mock mock = ctx.getBean(Mock.class);
		// mock.fillSchoolRepo();
		// mock.fillStudentRepository();
    }
}
