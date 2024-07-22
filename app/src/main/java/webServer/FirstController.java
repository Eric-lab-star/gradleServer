package webServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** FirstController */
@RestController
public class FirstController {

    @GetMapping("/hello")
    public String say(
				@RequestParam("name") String name
		) {
				return String.format("Hello, %s!", name);
    }

    @PostMapping("/post")
    public String post(@RequestBody String message) {
        return "recieved:🚀 " + message;
    }
}
