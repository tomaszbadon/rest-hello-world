package net.beans.java.hello.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

}

record Greetings(String message) { };

@RestController
class HelloRestResource {

	@GetMapping("/greetings")
	public ResponseEntity<Greetings> greetings() {
		return ResponseEntity.ok(new Greetings("Hello World"));
	}

}