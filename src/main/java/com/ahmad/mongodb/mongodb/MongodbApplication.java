package com.ahmad.mongodb.mongodb;

import com.ahmad.mongodb.mongodb.domain.Address;
import com.ahmad.mongodb.mongodb.domain.Student;
import com.ahmad.mongodb.mongodb.enumiration.Gender;
import com.ahmad.mongodb.mongodb.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository){

		return args -> {

			Address address = new Address("iran", "tehran", "123456");
			Student student = new Student(
					"Ahmad"
					, "Yazdi"
					,"ahmadyazdi243@gmailcom"
					, Gender.MALE
					, address
					, List.of("computer sience", "development")
					, BigDecimal.TEN
					, LocalDateTime.now()
			);
			repository.insert(student);

		};

	}

}
