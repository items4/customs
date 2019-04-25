package cn.gov.jseport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaCustomersManegerSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCustomersManegerSystemApplication.class, args);
	}

}
