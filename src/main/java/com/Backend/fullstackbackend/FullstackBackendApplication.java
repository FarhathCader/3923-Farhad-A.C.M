package com.Backend.fullstackbackend;

import com.Backend.fullstackbackend.model.Train;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class FullstackBackendApplication {



	public static void main(String[] args) {
		SpringApplication.run(FullstackBackendApplication.class, args);
	}

}
