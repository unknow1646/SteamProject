package com.example.steamproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SteamprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SteamprojectApplication.class, args);
	}

}
