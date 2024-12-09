package com.Shopaholic.Shopaholic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ShopaholicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopaholicApplication.class, args);
	}

}
