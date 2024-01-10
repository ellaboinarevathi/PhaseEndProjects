package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan("com.bean")
@EnableJpaRepositories("com.repository")
public class OnlineQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizApplication.class, args);
	}

}
