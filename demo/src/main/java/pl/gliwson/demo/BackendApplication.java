package pl.gliwson.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RefreshScope
public class BackendApplication {

	@Value("${spring.value}")
	public String springValue;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@GetMapping
	public String get() {
		return "He Word5557!!" + springValue;
	}

	@GetMapping("/two")
	public String get2() {
		return "Hello Word223!!";
	}
}
