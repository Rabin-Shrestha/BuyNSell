package edu.mum.client;

import edu.mum.client.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BuynsellclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuynsellclientApplication.class, args);

	}
}
