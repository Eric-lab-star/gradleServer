package webServer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final Hello hello;

    @Value("${my.name}")
    public String myname;

    public String getMyname(String name) {
        return name + myname;
    }

    public MyService(Hello hello) {
        this.hello = hello;
    }
}
