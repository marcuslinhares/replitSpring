package dev.spring.replit.spring_replit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringReplitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReplitApplication.class, args);
	}

	@RestController
	@RequestMapping(path = "/api")
	public class SomaController{

		@GetMapping
		public ResponseEntity<String> echo(){
			return ResponseEntity.ok().body("api no ar");
		}

		@GetMapping("/ola")
		public ResponseEntity<String> getMethodName() {
			return ResponseEntity.ok().body("ola replit");
		}
		
	}

}
