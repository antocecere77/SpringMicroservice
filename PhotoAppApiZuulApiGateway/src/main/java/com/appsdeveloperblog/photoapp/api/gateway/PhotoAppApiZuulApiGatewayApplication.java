package com.appsdeveloperblog.photoapp.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
public class PhotoAppApiZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApiZuulApiGatewayApplication.class, args);
	}

}
