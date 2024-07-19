package webServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
  public static void main(String[] args) {
    var ctx = SpringApplication.run(App.class, args);
    Hello grt = ctx.getBean("myBean", Hello.class);
    System.out.println(grt.say());
  }
}
