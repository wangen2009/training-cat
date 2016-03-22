package io.training.cat.dubbo.provider;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBootstrap.class, args);
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
