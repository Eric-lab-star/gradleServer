package webServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** FirstController */
@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello1";
    }

    @PostMapping("/post")
    public String post(@RequestBody String message) {
        return "recieved:🚀 " + message;
    }

		@PostMapping("/post2")
		public String post2(
				@RequestBody Order order 
				) {
			return order.toString();
		}
		@PostMapping("/post-record")
		public String postRecord(
				@RequestBody OrderRecord o
				) {
			return o.toString();
		}
}
