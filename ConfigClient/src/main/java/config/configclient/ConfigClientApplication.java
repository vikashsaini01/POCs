package config.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}


@RestController
class ControllerClass{
	
	@Value("${message}")
	private String messageValue;
	
	@RequestMapping("/messages")
	String getMessage() {
		return messageValue;
	}
}

@RestController
@RefreshScope
class ControllerClass2{
	
	@Value("${holi}")
	private String holiValue;
	
	@RequestMapping("/holi")
	String getMessage() {
		return holiValue;
	}
}