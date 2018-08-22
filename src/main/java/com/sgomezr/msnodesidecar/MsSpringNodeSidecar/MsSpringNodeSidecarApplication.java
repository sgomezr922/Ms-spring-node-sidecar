package com.sgomezr.msnodesidecar.MsSpringNodeSidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
@EnableEurekaClient
public class MsSpringNodeSidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringNodeSidecarApplication.class, args);
	}
}
