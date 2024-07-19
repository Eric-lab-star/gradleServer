package webServer;

import org.springframework.stereotype.Service;

@Service
public class MyService {
  private Hello hello;

  public MyService(Hello hello) {
    this.hello = hello;
  }

  public String HellofromService() {
    return "󰁨  : " + hello.say();
  }
}
