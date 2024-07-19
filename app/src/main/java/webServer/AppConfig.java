package webServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean("myBean")
  public Hello greeting() {
    return new Hello();
  }
}
