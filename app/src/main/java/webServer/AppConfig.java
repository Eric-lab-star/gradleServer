package webServer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
    @Bean
    @Profile("dev")
    public Hello firstBean() {
        return new Hello("first Bean");
    }

    @Bean
    @Profile("prod")
    public Hello secondBean() {
        return new Hello("second Bean");
    }
}
