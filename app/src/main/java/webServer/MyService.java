package webServer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final Hello hello;

    public MyService(@Qualifier("myBean") Hello hello) {
        this.hello = hello;
    }

    @Value("${my.name}")
    public String myname;

    public String getMyname() {
        return myname;
    }
}
