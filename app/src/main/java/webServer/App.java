package webServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        var springApp = new SpringApplication(App.class);
        springApp.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "prod"));
        var ctx = springApp.run(args);
        MyService service = ctx.getBean(MyService.class);
        System.out.println(service.getMyname());
        System.out.println(service.getHello());
    }
}
