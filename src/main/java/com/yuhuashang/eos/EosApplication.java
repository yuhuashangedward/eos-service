package com.yuhuashang.eos;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EosApplication {

	public static void main(String[] args) {
// This is a simple demo.
		new SpringApplicationBuilder(EosApplication.class)
				.web(true).run(args);
	}
}
