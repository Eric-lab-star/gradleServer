package webServer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Config
 */
@Configuration
public class Config {
    @Bean
    public Mock mock(StudentRepository studentRepository) {
	return new Mock(studentRepository);
    }
}
