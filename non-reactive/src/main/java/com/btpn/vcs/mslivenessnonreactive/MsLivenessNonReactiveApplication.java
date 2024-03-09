package com.btpn.vcs.mslivenessnonreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MsLivenessNonReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsLivenessNonReactiveApplication.class, args);
	}

}
