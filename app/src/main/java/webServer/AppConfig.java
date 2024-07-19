package webServer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Hello firstBean() {
        return new Hello("first Bean");
    }

    @Bean
    public Hello myBean() {
        return new Hello("second Bean");
    }
}
