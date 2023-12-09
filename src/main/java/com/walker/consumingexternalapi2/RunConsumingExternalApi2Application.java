package com.walker.consumingexternalapi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RunConsumingExternalApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(RunConsumingExternalApi2Application.class, args);
	}

}
