package com.kubernetesdemo.kuberdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class KuberdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KuberdemoApplication.class, args);
	}

}
