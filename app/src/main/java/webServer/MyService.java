package webServer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
    @PropertySource("classpath:application.properties"),
    @PropertySource("classpath:custom.properties")
})
public class MyService {
    private final Hello hello;
    private final Environment env;

    @Value("${custom.name}")
    public String greeting;

    public String getGreeting() {
        return greeting;
    }

    public MyService(@Qualifier("myBean") final Hello hello, final Environment env) {
        this.hello = hello;
        this.env = env;
    }

    public String getMyName() {
        return env.getProperty("my.name");
    }

    public String HellofromService() {
        return "󰁨  : " + hello.say();
    }
}
