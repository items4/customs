package cn.gov.jseport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("cn.gov.jseport.mapper")
public class SupervisionSystemProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupervisionSystemProviderApplication.class, args);
	}

}
