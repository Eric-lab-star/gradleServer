package webServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(App.class, args);
        MyService service = ctx.getBean(MyService.class);
        System.out.println(service.HellofromService());
        System.out.println(service.getMyName());
        System.out.println(service.getGreeting());
    }
}
